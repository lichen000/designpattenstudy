package lichen000.designpatten.abstractfactory;

public class ShapeFactory extends AbstractFactory {

    /**
     *
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

	/**
	 *
	 * @param color
	 * @return
	 */
	@Override
	public Color getColor(String color) {
		return null;
	}

}

