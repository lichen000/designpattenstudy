package lichen000.designpatten.builder;

/**
 * Created by chen.li200 on 2018-01-09
 */
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

}
