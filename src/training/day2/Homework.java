package training.day2;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //zadacha 1
        System.out.println("Homework Task 1");

        String[] words = new String[]{"alfa","avatar","beda","breza","salon"};

        System.out.println("The words starting with 'a' are:");

        for(int i= 0; i< words.length;i++) {
            if (words[i].indexOf("a") == 0) {

                System.out.println(words[i]);

            }
        }

        //zadacha 2
        System.out.println("Homework Task 2");

        int[] numbers = new int[]{1,7,3,9,3,6};
        int result = 0;

        for(int i= 0; i< numbers.length;i++){

            result = result + numbers[i];
        }

        System.out.println("The sum of the numbers is" + numbers);

        //zadacha 3
        //
        System.out.println("Homework Task 3");

        String[] words2 = new String[4];

        for(int i = 0;i< words2.length;i++){

            words2[i] = scanner.nextLine();
        }


        System.out.println("Thw words with less than for symbols are:");

        for(int i= 0; i< numbers.length;i++){

            if (words2[i].length()<=4){
                System.out.println(words2[i]);
            }

        }

    }
}
