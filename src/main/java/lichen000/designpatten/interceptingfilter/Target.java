package lichen000.designpatten.interceptingfilter;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class Target {
	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}
}
