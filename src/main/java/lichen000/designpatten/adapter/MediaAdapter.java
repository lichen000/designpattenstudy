package lichen000.designpatten.adapter;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("vlc") ){
			advancedMusicPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer = new Mp4Player();
		}
	}

	/**
	 *
	 * @param audioType
	 * @param fileName
	 */
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMusicPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer.playMp4(fileName);
		}
	}
}
