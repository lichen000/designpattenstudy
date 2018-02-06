package lichen000.designpatten.state;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class StartState implements State {

	/**
	 *
	 * @param context
	 */
	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	@Override
	public String toString(){
		return "Start State";
	}
}
