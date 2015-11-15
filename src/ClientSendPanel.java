import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ClientSendPanel extends JPanel {
	private static final long serialVersionUID = 7678867112361727996L;

	{
		PlayPanel pp = new PlayPanel(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	public static void main(String [] args){
		ClientSendPanel csp = new ClientSendPanel();
	}

}
