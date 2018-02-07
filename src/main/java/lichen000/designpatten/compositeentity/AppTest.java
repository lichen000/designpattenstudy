package lichen000.designpatten.compositeentity;

public class AppTest {

	public static void main(String[] args) {

		Client client = new Client();
		client.setData("Test", "Data");
		client.printData();
		client.setData("Second Test", "Data1");
		client.printData();
	}

}
