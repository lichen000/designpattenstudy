package lichen000.designpatten.chainofresponsibility;

/**
 * Created by chen.li200 on 2018-01-31
 */
public abstract class AbstractLogger {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int WARN = 3;
	public static int ERROR = 4;

	protected int level;

	protected AbstractLogger nextLogger;

	public void setNextLogger(AbstractLogger nextLogger){
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message){
		if(this.level <= level){
			write(message);
		}
		if(nextLogger !=null){
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);

}
