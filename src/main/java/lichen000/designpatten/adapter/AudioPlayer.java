package lichen000.designpatten.adapter;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class AudioPlayer implements MediaPlayer {

	private MediaAdapter mediaAdapter;

	/**
	 *
	 * @param audioType
	 * @param fileName
	 */
	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: "+ fileName);
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}

	}
}
