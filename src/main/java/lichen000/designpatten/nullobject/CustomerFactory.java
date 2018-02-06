package lichen000.designpatten.nullobject;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class CustomerFactory {

	private static final String[] names = {"Rob", "Joe", "Julie"};

	/**
	 *
	 * @param name
	 * @return
	 */
	public static AbstractCustomer getCustomer(String name){
		for (String name1 : names) {
			if (name1.equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
