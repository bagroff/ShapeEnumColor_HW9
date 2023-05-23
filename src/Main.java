import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", 10);
        shapes[1] = new Rectangle("Blue", 5, 7);
        shapes[2] = new Triangle("White", 5, 6, 7);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            shape.paint();
            System.out.println("Hash code is: " + shape.hashCode());
            System.out.println();
        }

        // Equals compare
        Rectangle r1 = new Rectangle("Red", 5, 7);
        Rectangle r2 = new Rectangle("Blue", 13, 8);
        System.out.println("Equals of Rectangle = " + r1.equals(r2));

        Circle c1 = new Circle("Yellow", 10);
        Circle c2 = new Circle("Yellow", 10);
        System.out.println("Equals of Circle = " + c1.equals(c2));

        Triangle t1 = new Triangle("White", 10, 12, 8);
        Triangle t2 = new Triangle("White", 10, 12, 8);
        System.out.println("Equals of Triangle = " + t1.equals(t2));

    }
}