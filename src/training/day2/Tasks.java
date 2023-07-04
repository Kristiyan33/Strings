package training.day2;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Tasks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //zadacha 1
        System.out.println("Task 1");
        System.out.println("Enter day of the week as number:");
        int n = scanner.nextInt();

        switch(n){

            case 1:
                System.out.println("Today is Monday.");
                break;
            case 2:
                System.out.println("Today is Tuesday.");
                break;
            case 3:
                System.out.println("Today is Wednesday.");
                break;
            case 4:
                System.out.println("Today is Thursday.");
                break;
            case 5:
                System.out.println("Today is Friday.");
                break;
            case 6:
                System.out.println("Today is Sunday.");
                break;
            case 7:
                System.out.println("Today is Saturday.");
                break;
        }


        // zadacha 2
        System.out.println("Task 2");
        String savedName  = new String("Ivan");
        int savedPassword = 1234;

        System.out.print("Enter name:");
        String name = scanner.nextLine();
        System.out.print("Enter password:");
        int password = scanner.nextInt();

        if(name.equals(savedName) && password == savedPassword){
            System.out.println("Welcome, " + savedName);
        }
        else {

            System.out.println("Wrong credetentials!");
        }

        //zadacha 3
        System.out.println("Task 3");
        System.out.print("Enter word:");
        String text = scanner.next();
        char[] letters = text.toCharArray();

        for(int i = 0; i< letters.length;i++){

            System.out.println(letters[i]);
        }

        //zadacha 4
        System.out.println("Task 4");
        System.out.print("Enter your weight in kilos:");
        int weight = scanner.nextInt();
        if(50<weight && weight<70){
            System.out.println("You are skinny.");
        }
        if(71<weight && weight<90) {
            System.out.println("You are skinny fat.");
        }
        if(91<weight && weight<110) {
            System.out.println("You are you are obese.");
        }
        if(111<weight) {
            System.out.println("You are extra obese.");
        }

        //zadacha 5
        System.out.println("Task 5");
        String[] dayOfWeek = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        for(int i = 0; i < dayOfWeek.length; i++){
            System.out.println(dayOfWeek[i]);
        }

   }
}