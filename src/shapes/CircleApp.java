package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        double radius = new Input().getDouble("Enter a radius: ");
        Circle circle = new Circle(radius);
        System.out.println("The area of your circle " + radius + " is: " + circle.getArea());
    }
}
