package ajou.ac.kr.team5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Simulation extends JFrame{

	private JPanel contentPane;
	private static int x=480;
	private static int y=220;
	private static int i=500;
	private static int count=1;
	private double pi=3.141592;
	private JPanel panel;
	public static Simulation frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Simulation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Simulation() 
	{
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1206, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		




		
		
		panel = new JPanel(){
			public void paintComponent(Graphics g){
				g.setColor(Color.black);
				g.fillRect(0, 0, 1700, 1700);

				Image sun = new ImageIcon("sun.jpg").getImage();
				g.drawImage(sun, 0, 0, this);

				Image earth = new ImageIcon("earth.jpg").getImage();
				g.drawImage(earth, 300, 170, this);
				

				Image moon = new ImageIcon("moon.jpg").getImage();
				g.drawImage(moon, (int)x, (int)y, this);
				

				Image[] img = new Image[26];
				for(int i = 0; i<img.length; i++){
					 img[i] = new ImageIcon(""+(i+1)+".jpg").getImage();
				}
				
				for(int i=0;i<26;i++){
					if(count == i+1){
						g.drawImage(img[i], 700, 50, this);
					}
				}
			}
		};
		
		JSlider slider = new JSlider();
		slider.setMaximum(1000);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				i = (slider.getValue()+500)%1000;
				x=(int) ((1+Math.cos(i*2*pi/1000))*140)+200;
				y=(int) ((1-Math.sin(i*2*pi/1000))*140)+70;
				count = (int) ((slider.getValue()*25)/1000)+1;
				
				panel.repaint();
			}
		});
		
		JButton btnNewButton = new JButton("Quit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		 
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1186, GroupLayout.PREFERRED_SIZE)
							.addGap(17))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(slider, GroupLayout.PREFERRED_SIZE, 567, GroupLayout.PREFERRED_SIZE)
							.addGap(176)
							.addComponent(btnNewButton)
							.addGap(54))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 549, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addContainerGap())
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 1186, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 549, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	
}
