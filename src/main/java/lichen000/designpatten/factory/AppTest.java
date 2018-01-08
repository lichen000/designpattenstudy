package lichen000.designpatten.factory;

public class AppTest {

    /**
     *
     */
    public static void runFactory1() {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        //通过工厂方法，不用再使用 如下的写法

//        Circle circle = new Circle();
//        circle.draw();
//        Rectangle rectangle = new Rectangle();
//        rectangle.draw();
//        Square square = new Square();
//        square.draw();

        //这样，隐藏了具体实现，统一化处理，
        //适合基于配置文件的统一生成对象，比如springboot 数据库连接池基于配置的数据库类型mysql mssql oracle生成不同的数据库连接
    }

    /**
     *
     */
    public static void runFactory2() {

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = (Circle) ShapeFactory.getShape2(Circle.class);

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = (Rectangle) ShapeFactory.getShape2(Rectangle.class);

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = (Square) ShapeFactory.getShape2(Square.class);

        //调用 Square 的 draw 方法
        shape3.draw();

        //这个经常用于日志文件，和json解析

    }

    public static void main(String[] args) {

        runFactory1();

        //工厂方法1在每增加一个形状时除了新增shape实现类，也需要调整shapefactory中的代码
        //通过反射和强制类型转换，可以在新增形状时不调整shapeFactory代码，只新增shape实现类即可
        runFactory2();

    }

}
