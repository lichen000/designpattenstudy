package lichen000.designpatten.abstractfactory;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class FactoryProducer {

	/**
	 *
	 * @param factoryType
	 * @return
	 */
	public static AbstractFactory getFactory(String factoryType){
		if(factoryType.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		} else if(factoryType.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		return null;
	}
}
