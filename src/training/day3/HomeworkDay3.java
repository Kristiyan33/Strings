package training.day3;

import java.util.Scanner;

public class HomeworkDay3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //zadacha 1
        System.out.println("Task 1");

        System.out.println("Enter three numbers below to see which of them is the smallest.");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("The smallest number is : " + smallestNumber(a,b,c));
        //
        //zadacha 2
        System.out.println("Task 2");

        System.out.println("Enter a number below to see whether its even or odd.");
        int input = scanner.nextInt();

        if(oddOrEven(input)){
            System.out.println("The number " + input + " is even.");
        }
        else
            System.out.println("The number " + input + " is odd.");
    }

    static int smallestNumber(int a, int b, int c){
        if(a<b && a<c)
            return a;
        if(b<a && b<c)
            return b;
        else if(c<a && c<b)
            return c;

        return -1;
    }

    static boolean oddOrEven(int input){
        if(input%2==0)
            return true;
        else
            return false;
    }
}
