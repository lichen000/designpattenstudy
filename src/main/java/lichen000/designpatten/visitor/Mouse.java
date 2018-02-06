package lichen000.designpatten.visitor;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}
