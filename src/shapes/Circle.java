package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }
    public double setArea(double area) {
        return this.radius = Math.sqrt(area / Math.PI);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double setCircumference(double circumference) {
        return this.radius = circumference / (2 * Math.PI);
    }

}
