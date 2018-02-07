package lichen000.designpatten.frontcontroller;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class Dispatcher {
	private HomeView homeView;
	private StudentView studentView;

	public Dispatcher() {
		homeView = new HomeView();
		studentView = new StudentView();
	}

	public void dispatch(String request) {
		if(request.equalsIgnoreCase("HOME")){
			homeView.show();
		}else{
			studentView.show();
		}
	}
}
