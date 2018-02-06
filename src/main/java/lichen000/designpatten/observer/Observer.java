package lichen000.designpatten.observer;

/**
 * Created by chen.li200 on 2018-02-06
 */
public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
