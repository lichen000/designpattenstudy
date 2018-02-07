package lichen000.designpatten.businessdelegate;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class Client {

	private BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}

	public void doTask() {
		businessDelegate.doTask();
	}

}
