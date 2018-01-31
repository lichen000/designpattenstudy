package lichen000.designpatten.chainofresponsibility;

/**
 * Created by chen.li200 on 2018-01-31
 */
public class ErrorLogger extends AbstractLogger {
	public ErrorLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}
