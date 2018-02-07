package lichen000.designpatten.servicelocator;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class Service2 implements Service {
	@Override
	public String getName() {
		return "Service2";
	}

	@Override
	public void execute() {
		System.out.println("executing Service2");
	}
}
