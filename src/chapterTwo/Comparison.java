package chapterTwo;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Enter number1: ");
        number1 = input.nextInt();

        System.out.println("Enter number2: ");
        number2 = input.nextInt();

        if(number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        if(number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        if(number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
    }
}
