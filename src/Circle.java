public class Circle extends Shape {
    final double PI = 3.14;
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
    }
}
