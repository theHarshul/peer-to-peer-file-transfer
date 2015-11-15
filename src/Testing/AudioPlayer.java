package Testing;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class AudioPlayer extends Application {
	
	
	public static void main(String [] args){
		Media song = new Media("file:///c:/Users/Harshul/Desktop/music/buzzin.mp3");
		MediaPlayer mediaPlayer = new MediaPlayer(song);
		mediaPlayer.play();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
