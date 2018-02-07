package lichen000.designpatten.businessdelegate;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class EJBService implements BusinessService {
	@Override
	public void doProcessing() {
		System.out.println("Processing task with EJB service");
	}
}
