import java.net.Socket;

public class MusicThread extends Thread {
	private Socket s;
	private MusicServer ms;

	public MusicThread(Socket s, MusicServer musicServer) {
		this.s = s;
		this.ms = ms;
	}
}
	