package lichen000.designpatten.businessdelegate;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class BusinessLookup {
	public BusinessService getBusinessService(String serviceType){
		if(serviceType.equalsIgnoreCase("EJB")){
			return new EJBService();
		}else {
			return new JMSService();
		}
	}
}
