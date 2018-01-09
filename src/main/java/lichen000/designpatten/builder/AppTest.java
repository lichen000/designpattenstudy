package lichen000.designpatten.builder;

public class AppTest {

    public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.printItems();
		System.out.println("Total Cost: " +vegMeal.getCost());

		System.out.println("\r\n");

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non-Veg Meal");
		nonVegMeal.printItems();
		System.out.println("Total Cost: " +nonVegMeal.getCost());

	}

}
