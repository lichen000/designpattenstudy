package lichen000.designpatten.frontcontroller;

public class AppTest {

    public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
    }
}
