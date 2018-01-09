package lichen000.designpatten.adapter;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class Mp4Player implements AdvancedMediaPlayer {

	/**
	 *
	 * @param fileName
	 */
	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}

	/**
	 *
	 * @param fileName
	 */
	@Override
	public void playVlc(String fileName) {
		//do nothing
	}
}
