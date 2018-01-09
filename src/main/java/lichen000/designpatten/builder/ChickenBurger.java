package lichen000.designpatten.builder;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Checken Burger";
	}

	@Override
	public double price() {
		return 20.00;
	}

}
