package training.week2.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter:");
        String num = scanner.nextLine();
        String operator = removeNumber(num);

        String[] temp = extractInt(num).split(" ");

        int[] numbers = new int[temp.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(temp[i]);
        }

        switch (operator.toLowerCase().trim()) {
            case "+":
            case "plus": {
                System.out.println("Result:" + (numbers[0] + numbers[1] ));
                break;

            }

            case "-":
            case "minus": {
                System.out.println("Result:" + (numbers[0] - numbers[1]));
                break;

            }

            case "*":
            case "multiply": {
                System.out.println("Result:" + (numbers[0] * numbers[1]));
                break;

            }

            case "/":
            case "divide":{
                System.out.println("Result:"+ (numbers[0] / numbers[1]));
                break;

            }
        }
    }

    public static String removeNumber(String s) {

        return s.replaceAll("\\d", "");
    }
    static String extractInt(String string) {

        string = string.replaceAll("[^0-9]", " ");
        string = string.replaceAll(" +", " ");

        if (string.equals("")) {
            return "-1";
        }
        return string;
    }
}
