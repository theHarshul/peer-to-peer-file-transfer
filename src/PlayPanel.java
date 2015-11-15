import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayPanel extends JFrame {
	
	private static final long serialVersionUID = 3480715559408830438L;
	
	private JButton shareButton;
	private JLabel shareLabel;
	private JFileChooser fc;
	private JPanel jp;
	
	public PlayPanel(ActionListener al){
		super("Song Share");
		initializeVariables();
		createGUI();
		addEvents(al);
		
		setVisible(true);
	}	
	
	private void addEvents(ActionListener al) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shareButton.addActionListener(al);
		
	}


	private void createGUI() {
		
		JPanel panel = new JPanel( new FlowLayout());
		
		setLayout(new BoxLayout( getContentPane(), BoxLayout.Y_AXIS ));
		setSize(500,500);
		setLocation(700,100);
		
		
		//shareLabel.setHorizontalAlignment(SwingConstants.CENTER);
		shareLabel.setBorder(BorderFactory.createEmptyBorder(10, 10 ,10, 10));
		
		//shareButton.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(shareLabel);
		
		panel.add(fc);
		
		add(panel);
		
		add(shareButton);
		
		
		
		
	}



	private void initializeVariables(){
		jp = new JPanel();
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		
		shareButton = new JButton("<html><div style=\"text-align: center;\">" + "Share!" + "</html>");
		shareLabel = new JLabel("<html><div style=\"text-align: center;\">" + "Share Song" + "</html>");
		fc = new JFileChooser();
	}
	
	public static void main(String [] args){
		PlayPanel pp = new PlayPanel(null);
		pp.setVisible(true);
	}
	
}
