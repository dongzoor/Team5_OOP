package ajou.ac.kr.team5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class MainMenu implements ActionListener{

	JButton info = new JButton("Information");
	JButton concept = new JButton("Concept");
	JButton simulation = new JButton("Simulation");
	JButton test = new JButton("Test");
	
	frame myFrame = new frame();
	
	public MainMenu(){
		
		
		JPanel panel = new JPanel();
		TitledBorder border = BorderFactory.createTitledBorder("MainMenu");		
		panel.setBorder(border);
		
		panel.add(info);
		panel.add(concept);
		panel.add(simulation);
		panel.add(test);
		
		info.addActionListener(this);
		concept.addActionListener(this);
		simulation.addActionListener(this);
		test.addActionListener(this);
		
		myFrame.add(panel);
		myFrame.setSize(350,450);
		myFrame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		MainMenu mainmenu = new MainMenu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if((JButton)e.getSource() == info){ 
			Information info = new Information();
			myFrame.setVisible(false);
		}
		if((JButton)e.getSource() == concept){ 
			Concept info = new Concept();
			myFrame.setVisible(false);
		}
	/*	if((JButton)e.getSource() == simulation){ 
			Simulation info = new Simulation();
			myFrame.setVisible(false);
		}*/
		if((JButton)e.getSource() == test){ 
			Test test;
			try {
				test = new Test();
				test.main(null);
				myFrame.setVisible(false);
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			
			
		}
		
		
	}
	
}
