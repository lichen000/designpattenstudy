package lichen000.designpatten.interceptingfilter;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class DebugFilter implements Filter {

	@Override
	public void doFilter(String request) {
		System.out.println("request log: " + request);
	}

}
