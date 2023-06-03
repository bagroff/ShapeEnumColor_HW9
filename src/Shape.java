abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void paint() {
        System.out.println("Painting shape with color: " + color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
