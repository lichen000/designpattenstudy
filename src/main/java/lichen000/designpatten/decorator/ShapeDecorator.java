package lichen000.designpatten.decorator;

/**
 * Created by chen.li200 on 2018-01-19
 */
public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape){
		this.decoratedShape = decoratedShape;
	}

	public void draw(){
		decoratedShape.draw();
	}
}
