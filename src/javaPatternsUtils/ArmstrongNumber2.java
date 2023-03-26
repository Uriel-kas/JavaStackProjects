package javaPatternsUtils;

import java.util.Scanner;

public class ArmstrongNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = input.nextInt();
        int sum = 0;
        int temp = number;
        int length = String.valueOf(number).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
