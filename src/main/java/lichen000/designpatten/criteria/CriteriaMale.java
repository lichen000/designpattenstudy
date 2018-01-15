package lichen000.designpatten.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen.li200 on 2018-01-15
 */
public class CriteriaMale implements Criteria {

	/**
	 *
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")){
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}
