import java.util.Objects;

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle [length = " + length + ", width = " + width + ", color = " + color + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle re = (Rectangle) o;

            return re.getColor().equals(this.color);

        } else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.width, this.length);
    }
}
