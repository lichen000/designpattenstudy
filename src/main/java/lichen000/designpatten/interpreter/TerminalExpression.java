package lichen000.designpatten.interpreter;

/**
 * Created by chen.li200 on 2018-01-31
 */
public class TerminalExpression implements Expression {
	private String data;

	public TerminalExpression(String data){
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if(context.contains(data)){
			return true;
		}
		return false;
	}
}
