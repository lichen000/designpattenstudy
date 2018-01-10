package lichen000.designpatten.bridge;


public class AppTest {

    public static void main(String[] args) {

		Shape redCircle = new Circle(50, 50, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 15, new GreenCircle());
		Shape blueCircle = new Circle(200, 200, 20, new BlueCircle());

		redCircle.draw();
		greenCircle.draw();
		blueCircle.draw();
	}

}
