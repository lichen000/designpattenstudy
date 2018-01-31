package lichen000.designpatten.chainofresponsibility;

/**
 * Created by chen.li200 on 2018-01-31
 */
public class FileLogger extends AbstractLogger {
	public FileLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}
