package lichen000.designpatten.memento;

/**
 * Created by chen.li200 on 2018-01-31
 */
public class Originator {
	private String state;

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public Memento saveStateToMemento(){
		return new Memento(state);
	}

	public void getStateFromMemento(Memento Memento){
		state = Memento.getState();
	}
}
