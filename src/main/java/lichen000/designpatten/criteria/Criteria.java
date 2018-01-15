package lichen000.designpatten.criteria;

import java.util.List;

/**
 * Created by chen.li200 on 2018-01-15
 */
public interface Criteria {
	List<Person> meetCriteria(List<Person> persons);
}
