package lichen000.designpatten.memento;

/**
 * Created by chen.li200 on 2018-01-31
 */
public class Memento {
	private String state;

	public Memento(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}
}
