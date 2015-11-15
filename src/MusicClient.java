import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javafx.scene.media.Media;

public class MusicClient extends Thread{
	
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private String hostname;
	private int port;
	private boolean isHost;
	private Socket s;
	private Media media;
	private BufferedOutputStream bos;
	
	
	public MusicClient(String hostname, int port) {
		this.hostname = hostname;
		this.port = port;
		
		try{
			s = new Socket(hostname,port);
			System.out.println("Connected");
			int filesize=1022386; 
			int bytesRead;
			int currentTot = 0;
			byte [] bytearray = new byte [999999999];
			InputStream is = s.getInputStream();
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Harshul\\Desktop\\received.mp3");
			bos = new BufferedOutputStream(fos);
			bytesRead = is.read(bytearray,0,bytearray.length); 
			currentTot = bytesRead; 
			do { 
				bytesRead = is.read(bytearray, currentTot, (bytearray.length-currentTot)); 
				if(bytesRead >= 0) 
					currentTot += bytesRead; 
				} while(bytesRead > -1); 
			bos.write(bytearray, 0 , currentTot);

			
		} catch(IOException ioe){
			System.out.println("ioe in MusicClient constructor " + ioe.getMessage());
		}
		finally{
			if(s != null){
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bos != null){
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	public static void main(String [] args){
		MusicClient mc = new MusicClient("localhost",6789);
	}
	
	
	
	
	
	
	

}
