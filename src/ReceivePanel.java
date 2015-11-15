import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ReceivePanel extends JFrame {
	private JButton receiveButton;
	
	public ReceivePanel(){
		initializeComponents();
		createGUI();
		addEvents();
	}
	
	private void initializeComponents() {
		receiveButton = new JButton("Receive");
		
		
	}

	private void createGUI() {
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		add(receiveButton);		
	}

	private void addEvents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String [] args){
		ReceivePanel rp = new ReceivePanel();
		rp.setVisible(true);
		
	}

}
