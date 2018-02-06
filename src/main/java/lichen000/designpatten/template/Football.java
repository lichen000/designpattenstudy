package lichen000.designpatten.template;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class Football extends Game {
	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}
}
