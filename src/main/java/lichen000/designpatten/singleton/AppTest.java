package lichen000.designpatten.singleton;

public class AppTest {

    public static void main(String[] args) {

		SingletonObj1 singletonObj1 = SingletonObj1.getInstance();
		singletonObj1.showMessage();

		SingletonObj2 singletonObj2 = SingletonObj2.getInstance();
		singletonObj2.showMessage();

		SingletonObj3 singletonObj3 = SingletonObj3.getInstance();
		singletonObj3.showMessage();

		SingletonObj4 singletonObj4 = SingletonObj4.getInstance();
		singletonObj4.showMessage();

		SingletonObj5 singletonObj5 = SingletonObj5.getInstance();
		singletonObj5.showMessage();

		SingletonObj6 singletonObj6 = SingletonObj6.INSTANCE;
		singletonObj6.showMessage();

	}

}
