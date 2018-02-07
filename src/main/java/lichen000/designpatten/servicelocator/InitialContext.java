package lichen000.designpatten.servicelocator;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class InitialContext {

	/**
	 *
	 * @param JNDIName
	 * @return
	 */
	public Service lookup(String JNDIName) {
		if(JNDIName.equalsIgnoreCase("SERVICE1")){
			System.out.println("Looking up and creating a new Service1 object");
			return new Service1();
		}else if (JNDIName.equalsIgnoreCase("SERVICE2")){
			System.out.println("Looking up and creating a new Service2 object");
			return new Service2();
		}
		return null;
	}
}
