package lichen000.designpatten.adapter;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class AudioPlayer implements MediaPlayer {

	/**
	 *
	 * @param audioType
	 * @param fileName
	 */
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: "+ fileName);
		}
	}
}
