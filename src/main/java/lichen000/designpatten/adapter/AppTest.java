package lichen000.designpatten.adapter;


public class AppTest {

    public static void main(String[] args) {

		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "111.mp3");

		audioPlayer.play("mp4", "222.mp4");

		audioPlayer.play("vlc", "333.vlc");

		audioPlayer.play("avi", "444.avi");


	}

}
