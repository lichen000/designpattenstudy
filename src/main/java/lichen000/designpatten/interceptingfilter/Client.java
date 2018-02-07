package lichen000.designpatten.interceptingfilter;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class Client {
	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager){
		this.filterManager = filterManager;
	}

	public void sendRequest(String request){
		filterManager.filterRequest(request);
	}
}
