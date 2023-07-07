package training.day5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle");

        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        System.out.println("Enter h:");
        double h = scanner.nextDouble();


        Triangle triangle1 = new Triangle( a, b, c, h);
        System.out.println("The area of the triangle is: " + triangle1.calculateArea());
        System.out.println("The perimeter of the triangle is: " + triangle1.calculatePerimeter());

        System.out.println("Rectangle");

        System.out.println("Enter a:");
        double a1 = scanner.nextDouble();
        System.out.println("Enter b:");
        double b1 = scanner.nextDouble();

        //

        Rectangle rectangle1 = new Rectangle(a1, b1);
        System.out.println("The area of the rectangle is: " + rectangle1.calculateArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle1.calculatePerimeter());

    }
}
