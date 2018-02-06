package lichen000.designpatten.visitor;

/**
 * Created by chen.li200 on 2018-02-06
 */
public interface ComputerPartVisitor {
	void visit(Computer computer);
	void visit(Mouse mouse);
	void visit(Keyboard keyboard);
	void visit(Monitor monitor);
}
