package lichen000.designpatten.prototype;

/**
 * Created by chen.li200 on 2018-01-09
 */
public abstract class Shape implements Cloneable {
	private String id;
	protected String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	abstract void draw();

	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
