package lichen000.designpatten.strategy;

/**
 *
 */
public class AppTest {

    public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context.setStrategy(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context.setStrategy(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
