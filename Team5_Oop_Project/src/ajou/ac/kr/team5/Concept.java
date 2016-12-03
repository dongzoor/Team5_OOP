package ajou.ac.kr.team5;

import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Concept {


	public Concept(){
		
		MainFrame myFrame = new MainFrame();
		
		JPanel panel = new JPanel();
		TitledBorder border = BorderFactory.createTitledBorder("Concept");		
		panel.setBorder(border);
		

		myFrame.add(panel);
		myFrame.setSize(350,450);
		myFrame.setVisible(true);
		
	}
}
