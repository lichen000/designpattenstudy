package lichen000.designpatten.builder;

/**
 * Created by chen.li200 on 2018-01-09
 */
public class MealBuilder {

	/**
	 *
	 * @return
	 */
	public Meal prepareVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new OrangeJuice());
		return meal;
	}

	/**
	 *
	 * @return
	 */
	public Meal prepareNonVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		return meal;
	}
}
