package lichen000.designpatten.state;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class Context {

	private State state;

	public Context(){
		state = null;
	}

	public void setState(State state){
		this.state = state;
	}

	public State getState(){
		return state;
	}
}
