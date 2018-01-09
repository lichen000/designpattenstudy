package lichen000.designpatten.builder;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public double price() {
		return 15.00;
	}

}
