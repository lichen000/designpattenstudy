package lichen000.designpatten.visitor;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class Computer implements ComputerPart {

	private ComputerPart[] parts;

	public Computer(){
		parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (ComputerPart part : parts) {
			part.accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
}
