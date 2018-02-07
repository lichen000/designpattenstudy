package lichen000.designpatten.businessdelegate;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class BusinessDelegate {
	private BusinessLookup businessLookup = new BusinessLookup();

	private BusinessService businessService;

	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = businessLookup.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}
