package shapes;

public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    @Override
    public double getArea() {
        System.out.println("im in aquare!");
        return Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.println("im in aquare!");
        return length * 4;
    }




}
