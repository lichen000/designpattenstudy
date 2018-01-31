package lichen000.designpatten.chainofresponsibility;

/**
 * Created by chen.li200 on 2018-01-31
 */
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}
