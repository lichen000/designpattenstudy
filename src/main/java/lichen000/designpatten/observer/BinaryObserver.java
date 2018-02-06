package lichen000.designpatten.observer;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}
