package lichen000.designpatten.strategy;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy){
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2){
		return strategy.doOperation(num1, num2);
	}
}
