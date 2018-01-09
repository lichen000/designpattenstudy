package lichen000.designpatten.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class Meal {

	private List<Item> items = new ArrayList<>();

	/**
	 *
	 * @param item
	 */
	public void addItem(Item item) {
		items.add(item);
	}

	/**
	 *
	 * @return
	 */
	public double getCost() {
		double cost = 0;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	/**
	 *
	 */
	public void printItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : "+item.packing().pack());
			System.out.println(", Price : "+item.price());
		}
	}
}
