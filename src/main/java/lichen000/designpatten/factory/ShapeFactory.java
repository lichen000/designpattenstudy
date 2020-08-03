package lichen000.designpatten.factory;

public class ShapeFactory {

    /**
     *
     * @param shapeTypeEnum
     * @return
     */
    public Shape getShape(ShapeTypeEnum shapeTypeEnum) {
        if (shapeTypeEnum == null) {
            return null;
        }
        if (shapeTypeEnum == ShapeTypeEnum.CIRCLE) {
            return new Circle();
        } else if (shapeTypeEnum == ShapeTypeEnum.RECTANGLE) {
            return new Rectangle();
        } else if (shapeTypeEnum == ShapeTypeEnum.SQUARE) {
            return new Square();
        }
        return null;
    }
}

