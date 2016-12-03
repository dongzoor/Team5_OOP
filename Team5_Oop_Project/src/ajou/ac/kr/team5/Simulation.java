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
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Simulation extends JFrame{

	private JPanel contentPane;
	private static int x=480;
	private static int y=220;
	private static int i=500;
	private static int count=1;
	private double pi=3.141592;
	private JPanel panel;
	private JPanel panel_1;
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		panel = new JPanel(){
			public void paintComponent(Graphics g){
				g.setColor(Color.black);
				g.fillRect(0, 0, 700, 700);

				Image sun = new ImageIcon("sun.jpg").getImage();
				g.drawImage(sun, 0, 0, this);

				Image earth = new ImageIcon("earth.jpg").getImage();
				g.drawImage(earth, 300, 170, this);
				

				Image moon = new ImageIcon("moon.jpg").getImage();
				g.drawImage(moon, (int)x, (int)y, this);
				

			}
		};
		
		JSlider slider = new JSlider();
		slider.setMaximum(1000);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				i = (slider.getValue()+500)%1000;
				x=(int) ((1+Math.cos(i*2*pi/1000))*140)+200;
				y=(int) ((1-Math.sin(i*2*pi/1000))*140)+70;
				panel.repaint();
			
				count = (int) ((slider.getValue()*25)/1000)+1;
				panel_1.repaint();
				
			}
		});
		
		panel_1 = new JPanel(){

			@Override
			public void paintComponent(Graphics g){

				Image img1 = new ImageIcon("1.jpg").getImage();
				Image img2 = new ImageIcon("2.jpg").getImage();
				Image img3 = new ImageIcon("3.jpg").getImage();
				Image img4 = new ImageIcon("4.jpg").getImage();
				Image img5 = new ImageIcon("5.jpg").getImage();
				Image img6 = new ImageIcon("6.jpg").getImage();
				Image img7 = new ImageIcon("7.jpg").getImage();
				Image img8 = new ImageIcon("8.jpg").getImage();
				Image img9 = new ImageIcon("9.jpg").getImage();
				Image img10 = new ImageIcon("10.jpg").getImage();
				Image img11 = new ImageIcon("11.jpg").getImage();
				Image img12 = new ImageIcon("12.jpg").getImage();
				Image img13 = new ImageIcon("13.jpg").getImage();
				Image img14 = new ImageIcon("14.jpg").getImage();
				Image img15 = new ImageIcon("15.jpg").getImage();
				Image img16 = new ImageIcon("16.jpg").getImage();
				Image img17 = new ImageIcon("17.jpg").getImage();
				Image img18 = new ImageIcon("18.jpg").getImage();
				Image img19 = new ImageIcon("19.jpg").getImage();
				Image img20 = new ImageIcon("20.jpg").getImage();
				Image img21 = new ImageIcon("21.jpg").getImage();
				Image img22 = new ImageIcon("22.jpg").getImage();
				Image img23 = new ImageIcon("23.jpg").getImage();
				Image img24 = new ImageIcon("24.jpg").getImage();
				Image img25 = new ImageIcon("25.jpg").getImage();
				Image img26 = new ImageIcon("26.jpg").getImage();

				if(count == 1)
				g.drawImage(img1, 0, 0, this);

				if(count == 2)
				g.drawImage(img2, 0, 0, this);

				if(count == 3)
				g.drawImage(img3, 0, 0, this);

				if(count == 4)
				g.drawImage(img4, 0, 0, this);

				if(count == 5)
				g.drawImage(img5, 0, 0, this);

				if(count == 6)
				g.drawImage(img6, 0, 0, this);

				if(count == 7)
				g.drawImage(img7, 0, 0, this);

				if(count == 8)
				g.drawImage(img8, 0, 0, this);

				if(count == 9)
				g.drawImage(img9, 0, 0, this);

				if(count == 10)
				g.drawImage(img10, 0, 0, this);

				if(count == 11)
				g.drawImage(img11, 0, 0, this);
			

				if(count == 12)
				g.drawImage(img12, 0, 0, this);

				if(count == 13)
				g.drawImage(img13, 0, 0, this);

				if(count == 14)
				g.drawImage(img14, 0, 0, this);
				if(count == 15)
				g.drawImage(img15, 0, 0, this);

				if(count == 16)
				g.drawImage(img16, 0, 0, this);

				if(count == 17)
				g.drawImage(img17, 0, 0, this);

				if(count == 18)
				g.drawImage(img18, 0, 0, this);

				if(count == 19)
				g.drawImage(img19, 0, 0, this);

				if(count == 20)
				g.drawImage(img20, 0, 0, this);

				if(count == 21)
				g.drawImage(img21, 0, 0, this);

				if(count == 22)
				g.drawImage(img22, 0, 0, this);

				if(count == 23)
				g.drawImage(img23, 0, 0, this);

				if(count == 24)
				g.drawImage(img24, 0, 0, this);

				if(count == 25)
				g.drawImage(img25, 0, 0, this);

				if(count == 26)
				g.drawImage(img26, 0, 0, this);

			}
		};
		
		JLabel lblViewFromEarth = new JLabel("View From Earth");
		lblViewFromEarth.setHorizontalAlignment(SwingConstants.CENTER);
		
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
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 545, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(64)
									.addComponent(lblViewFromEarth, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(slider, GroupLayout.PREFERRED_SIZE, 694, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton)
							.addGap(56))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
							.addGap(33))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblViewFromEarth)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 451, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
