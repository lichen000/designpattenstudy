package lichen000.designpatten.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen.li200 on 2018-01-31
 */
public class Broker {

	private List<Order> orderList = new ArrayList<>();

	public void takeOrder(Order order){
		orderList.add(order);
	}

	public void placeOrders(){
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
