package creational.factory;

import java.util.NoSuchElementException;

public class ShapeFactory {

    public static String fake = "asdsad";

    public static Shape provideShape(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case TRIANGLE:
                shape = new Triangle();
                break;
            default:
                throw new NoSuchElementException();
        }
        return shape;
    }
}
