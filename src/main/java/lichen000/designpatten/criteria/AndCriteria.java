package lichen000.designpatten.criteria;

import java.util.List;

/**
 * Created by chen.li200 on 2018-01-15
 */
public class AndCriteria implements Criteria {
	private Criteria oneCriteria;
	private Criteria otherCriteria;

	/**
	 *
	 * @param oneCriteria
	 * @param otherCriteria
	 */
	public AndCriteria(Criteria oneCriteria, Criteria otherCriteria) {
		this.oneCriteria = oneCriteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = oneCriteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}
}
