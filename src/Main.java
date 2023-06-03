import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(Color.RED, 10);
        shapes[1] = new Rectangle(Color.BLUE, 5, 7);
        shapes[2] = new Triangle(Color.GREEN, 5, 6, 7);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            shape.paint();
            System.out.println("Hash code is: " + shape.hashCode());
            System.out.println();
        }

        // Equals compare
        Rectangle r1 = new Rectangle(Color.RED, 5, 7);
        Rectangle r2 = new Rectangle(Color.BLUE, 13, 8);
        System.out.println("Equals of Rectangle = " + r1.equals(r2));

        Circle c1 = new Circle(Color.GREEN, 10);
        Circle c2 = new Circle(Color.GREEN, 10);
        System.out.println("Equals of Circle = " + c1.equals(c2));

        Triangle t1 = new Triangle(Color.BLUE, 10, 12, 8);
        Triangle t2 = new Triangle(Color.BLUE, 10, 12, 8);
        System.out.println("Equals of Triangle = " + t1.equals(t2));

    }
}