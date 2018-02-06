package lichen000.designpatten.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class Subject {

	private List<Observer> observers = new ArrayList<>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer){
		observers.add(observer);
	}

	private void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
