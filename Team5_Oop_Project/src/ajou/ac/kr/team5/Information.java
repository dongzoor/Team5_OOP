package ajou.ac.kr.team5;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Information {
	

	public Information(){
		
		MainFrame myFrame = new MainFrame();
		
		JPanel panel = new JPanel();
		TitledBorder border = BorderFactory.createTitledBorder("Information");		
		panel.setBorder(border);
		

		myFrame.add(panel);
		myFrame.setSize(350,450);
		myFrame.setVisible(true);
		
	}

}
