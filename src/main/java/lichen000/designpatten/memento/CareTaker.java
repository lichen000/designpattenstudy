package lichen000.designpatten.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen.li200 on 2018-01-31
 */
public class CareTaker {
	private List<Memento> mementoList = new ArrayList<>();

	public void add(Memento state){
		mementoList.add(state);
	}

	public Memento get(int index){
		return mementoList.get(index);
	}
}
