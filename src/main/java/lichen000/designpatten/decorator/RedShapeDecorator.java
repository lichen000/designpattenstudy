package lichen000.designpatten.decorator;

/**
 * Created by chen.li200 on 2018-01-19
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	/**
	 *
	 */
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	/**
	 *
	 * @param decoratedShape
	 */
	private void setRedBorder(Shape decoratedShape){
		System.out.println("Border Color: Red");
	}
}
