package lichen000.designpatten.strategy;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class OperationMultiply implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}
