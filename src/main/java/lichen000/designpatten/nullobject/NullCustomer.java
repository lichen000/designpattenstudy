package lichen000.designpatten.nullobject;

/**
 * Created by chen.li200 on 2018-02-06
 */
public class NullCustomer extends AbstractCustomer {

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

	@Override
	public boolean isNil() {
		return true;
	}
}
