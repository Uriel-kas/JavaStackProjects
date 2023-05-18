package chapterSix;

import java.util.Scanner;

public class RoundingNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double number = input.nextDouble();

        roundToInteger(number);
        roundToTenths(number);
        roundToHundredths(number);
        roundToThousandths(number);
    }
    public static void roundToInteger(double number) {
        int rounded = (int) Math.floor(number + 0.5);
        System.out.printf("Original: %.2f, Rounded to Integer: %d\n", number, rounded);
    }

    public static void roundToTenths(double number) {
        double rounded = Math.floor(number * 10 + 0.5) / 10;
        System.out.printf("Original: %.2f, Rounded to Tenths: %.1f\n", number, rounded);
    }

    public static void roundToHundredths(double number) {
        double rounded = Math.floor(number * 100 + 0.5) / 100;
        System.out.printf("Original: %.2f, Rounded to Hundredths: %.2f\n", number, rounded);
    }

    public static void roundToThousandths(double number) {
        double rounded = Math.floor(number * 1000 + 0.5) / 1000;
        System.out.printf("Original: %.2f, Rounded to Thousandths: %.3f\n", number, rounded);
    }
}