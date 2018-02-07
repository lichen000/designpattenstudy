package lichen000.designpatten.servicelocator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class Cache {
	private List<Service> services;

	public Cache(){
		services = new ArrayList<>();
	}

	/**
	 *
	 * @param serviceName
	 * @return
	 */
	public Service getService(String serviceName){
		for (Service service : services) {
			if(service.getName().equalsIgnoreCase(serviceName)){
				System.out.println("Returning cached  "+serviceName+" object");
				return service;
			}
		}
		return null;
	}

	/**
	 *
	 * @param newService
	 */
	public void addService(Service newService){
		boolean exists = false;
		for (Service service : services) {
			if(service.getName().equalsIgnoreCase(newService.getName())){
				exists = true;
			}
		}
		if(!exists){
			services.add(newService);
		}
	}

}
