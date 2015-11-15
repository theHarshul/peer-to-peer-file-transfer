import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class MusicServer {
	//private Vector<MusicThread> mtVector;
	
	public MusicServer(int port) {
		//mtVector = new Vector<MusicThread>();
		try {
			ServerSocket ss = new ServerSocket(port); // listening into this
														// port we cant listen
														// any other port
			System.out.println("Bound to port " + port);
			
			while (true) {
				Socket s = ss.accept();
				System.out.println("Connected: " + s.getInetAddress());
				File transferFile = new File ("C:\\Users\\Harshul\\Desktop\\music\\byob.mp3"); 
				byte[] mybytearray = new byte[(int) transferFile.length()];
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(transferFile));
			    bis.read(mybytearray, 0, mybytearray.length);
			    OutputStream os = s.getOutputStream();
			    System.out.println("Sending Files...");
			    os.write(mybytearray,0,mybytearray.length);
			    os.flush();
			    s.close();

				
			}
		} catch (IOException ioe) {
			System.out.println("ioe in MusicServer constructor: " + ioe.getMessage());
		}
	}
	
	



	public static void main(String[] args) {
		MusicServer ms = new MusicServer(6789);
	}




	
}
