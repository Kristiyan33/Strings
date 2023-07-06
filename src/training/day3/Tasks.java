package training.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // zadacha 1
        System.out.println("Task 1");
        int[] numbers = new int[]{10, 2, 1, -1, 5, 9, 7, 6, 5, -5};
        task1(numbers);

        // zadacha 2
        System.out.println("Task 2");
        String word1 = "Plovdiv";
        String word2 = "lov";
        if (word1.contains(word2)) {
            String result = word1.replace(word2, "");
            System.out.println(result);
        }

        // zadacha 3
        System.out.println("Task 3");
        System.out.println(reversing("I love Java"));

        // zadacha 4
        System.out.println("Task 4");
        System.out.println(initials("Kristiyan Zheliazkov"));

        // zadacha 5
        System.out.println("Task 5");
        ArrayList<String> arrlist = new ArrayList();
        System.out.println("Enter words:");
        arrlist.add(scanner.nextLine());
        arrlist.add(scanner.nextLine());
        arrlist.add(scanner.nextLine());
        arrlist.add(scanner.nextLine());
        swappingElements(arrlist);

        for (int i = 0; i < arrlist.size(); ++i) {
            System.out.println((String) arrlist.get(i));
        }

    }

    static void task1(int[] numbers) {
        System.out.println("The positive numbers in the array are:");

        int n;
        for (n = 0; n < numbers.length; ++n) {
            if (numbers[n] > 0) {
                System.out.println(numbers[n]);
            }
        }

        System.out.println("The negative numbers in the array are:");

        for (n = 0; n < numbers.length; ++n) {
            if (numbers[n] < 0) {
                System.out.println(numbers[n]);
            }
        }

        System.out.println("The odd numbers in the array are:");

        for (n = 0; n < numbers.length; ++n) {
            if (numbers[n] % 2 == 1) {
                System.out.println(numbers[n]);
            }
        }

        System.out.println("The even numbers in the array are:");

        for (n = 0; n < numbers.length; ++n) {
            if (numbers[n] % 2 == 0) {
                System.out.println(numbers[n]);
            }
        }

        n = 0;

        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == 5 || numbers[i] == -5) {
                ++n;
            }
        }

        System.out.println("There is " + n + " times the numbers 5 in the array.");
    }

    static String reversing(String input) {
        String[] temp = input.split(" ");
        input = " ";

        for (int i = temp.length - 1; i >= 0; --i) {
            input = input.concat(temp[i] + " ");
        }

        return input;
    }

    static String initials(String names) {
        String initials;
        initials = names.substring(0, 1);
        initials = initials + " ";
        int space = names.indexOf(" ");
        initials = initials + names.substring(space + 1, space + 2);
        return initials;
    }

    static void swappingElements(ArrayList<String> words) {
        String temp = (String) words.get(0);
        words.set(0, words.get(words.size() - 1));
        words.set(words.size() - 1, temp);
    }
}
