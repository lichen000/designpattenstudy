package lichen000.designpatten.command;

/**
 * Created by chen.li200 on 2018-01-31
 */
public class BuyStock implements Order {

	private Stock abcStock;

	public BuyStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.buy();
	}
}
