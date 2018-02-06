package lichen000.designpatten.template;

/**
 * Created by chen.li200 on 2018-02-06
 */
public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();

	//模板
	public final void play(){

		//初始化游戏
		initialize();

		//开始游戏
		startPlay();

		//结束游戏
		endPlay();
	}
}
