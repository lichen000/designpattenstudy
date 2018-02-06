package lichen000.designpatten.visitor;

public class AppTest {

    public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
