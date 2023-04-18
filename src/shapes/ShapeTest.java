package shapes;

public class ShapeTest {

    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Rectangle(4,5);
        System.out.println("Rectangle perimeter: " + myShape.getPerimeter());
        System.out.println("Rectangle area: " + myShape.getArea());

        myShape = new Square(5);
        System.out.println("Square perimetere: " + myShape.getPerimeter());
        System.out.println("Square area: " + myShape.getArea());
    }
}
