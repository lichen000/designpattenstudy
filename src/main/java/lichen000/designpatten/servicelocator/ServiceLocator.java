package lichen000.designpatten.servicelocator;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class ServiceLocator {
	private static Cache cache;

	static {
		cache = new Cache();
	}

	public static Service getService(String jndiName){

		Service service = cache.getService(jndiName);

		if(service != null){
			return service;
		}

		InitialContext context = new InitialContext();
		Service service1 = context.lookup(jndiName);
		cache.addService(service1);
		return service1;
	}
}
