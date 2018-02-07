package lichen000.designpatten.interceptingfilter;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class FilterManager {
	FilterChain filterChain;

	public FilterManager(Target target){
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}
	public void setFilter(Filter filter){
		filterChain.addFilter(filter);
	}

	public void filterRequest(String request){
		filterChain.doFilter(request);
	}
}
