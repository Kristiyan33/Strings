package training.day5;

public class Triangle implements Shape{

    double sideA;
    double sideB;
    double sideC;
    double heightA;

    public Triangle(double a, double b, double c, double height){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        this.heightA = height;
    }

    @Override
    public double calculateArea() {
        return (sideA*heightA)/2;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
