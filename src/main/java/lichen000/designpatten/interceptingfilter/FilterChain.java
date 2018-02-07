package lichen000.designpatten.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class FilterChain {
	private List<Filter> filters = new ArrayList<>();
	private Target target;

	public void addFilter(Filter filter){
		filters.add(filter);
	}

	public void doFilter(String request){
		for (Filter filter : filters) {
			filter.doFilter(request);
		}
		target.execute(request);
	}

	public void setTarget(Target target){
		this.target = target;
	}
}
