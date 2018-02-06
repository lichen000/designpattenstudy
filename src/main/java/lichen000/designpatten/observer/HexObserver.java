package lichen000.designpatten.observer;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class HexObserver extends Observer {
	public HexObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
	}
}
