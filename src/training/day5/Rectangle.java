package training.day5;

public class Rectangle implements Shape{

    double sideA;
    double sideB;

    public Rectangle(double a, double b){
        this.sideA = a;
        this.sideB = b;
    }
    @Override
    public double calculateArea() {
        return sideA*sideB;
    }

    @Override
    public double calculatePerimeter() {
        return 2*sideA + 2*sideB;
    }
}
