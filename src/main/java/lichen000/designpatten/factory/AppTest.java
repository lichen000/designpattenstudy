package lichen000.designpatten.factory;

public class AppTest {

    /**
     *
     */
    public static void runFactory1() {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape(ShapeTypeEnum.CIRCLE);

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape(ShapeTypeEnum.RECTANGLE);

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape(ShapeTypeEnum.SQUARE);

        //调用 Square 的 draw 方法
        shape3.draw();

        //通过工厂方法，不用再使用如下的写法

//        Shape circle = new Circle();
//        circle.draw();
//        Shape rectangle = new Rectangle();
//        rectangle.draw();
//        Shape square = new Square();
//        square.draw();

        //这样，隐藏了具体实现，统一化处理，
        //适合基于配置文件的统一生成对象，比如springboot 数据库连接池基于配置的数据库类型mysql mssql oracle生成不同的数据库连接
    }

    public static void main(String[] args) {

        runFactory1();

    }

}
