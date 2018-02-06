package lichen000.designpatten.visitor;

/**
 * Created by chen.li200 on 2018-02-06
 */
public interface ComputerPart {
	void accept(ComputerPartVisitor computerPartVisitor);
}
