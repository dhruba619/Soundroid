import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class PlayMySong {

	public static void main(String[] args){
		String musicFileLocation = "C:\\Users\\dhrubajyotib\\Downloads\\Uppermost - Flow.mp3";
		try {
			InputStream inputStream = new FileInputStream(musicFileLocation);
			AudioStream audioStream = new AudioStream(inputStream);
			AudioPlayer.player.start(audioStream);

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
