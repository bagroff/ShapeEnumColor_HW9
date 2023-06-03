import java.util.Objects;

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(Color color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle [side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + ", color = " + color + "]";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;
        return Double.compare(triangle.side1, side1) == 0 && Double.compare(triangle.side2, side2) == 0 && Double.compare(triangle.side3, side3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, side3);
    }
}
