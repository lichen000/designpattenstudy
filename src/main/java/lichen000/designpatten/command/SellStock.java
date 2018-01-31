package lichen000.designpatten.command;

/**
 * Created by chen.li200 on 2018-01-31
 */
public class SellStock implements Order {

	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.sell();
	}

}
