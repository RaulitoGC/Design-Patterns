package creational.factory;

public class Main {

    public static void main(String[] args) {

        Shape circle = ShapeFactory.provideShape(ShapeType.CIRCLE);
        Shape square = ShapeFactory.provideShape(ShapeType.SQUARE);
        Shape triangle = ShapeFactory.provideShape(ShapeType.TRIANGLE);

        circle.draw();
        square.draw();
        triangle.draw();
    }
}
