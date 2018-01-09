package lichen000.designpatten.abstractfactory;

public class ColorFactory extends AbstractFactory {

    /**
     *
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {
        return null;
    }

	/**
	 *
	 * @param color
	 * @return
	 */
	@Override
	Color getColor(String color) {
		if(color == null){
			return null;
		}
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		} else if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		} else if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;
	}
}