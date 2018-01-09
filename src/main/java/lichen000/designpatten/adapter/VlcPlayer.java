package lichen000.designpatten.adapter;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	/**
	 *
	 * @param fileName
	 */
	@Override
	public void playMp4(String fileName) {
		//do nothing
	}

	/**
	 *
	 * @param fileName
	 */
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}
}
