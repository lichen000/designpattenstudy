package lichen000.designpatten.template;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class Cricket extends Game {
	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}
}
