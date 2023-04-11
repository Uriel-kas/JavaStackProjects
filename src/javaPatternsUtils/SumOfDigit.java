package javaPatternsUtils;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        int n, x;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        while (n > 0) {
            x = n % 10;
            sum += x;
            n /= 10;
        }
        System.out.print("Sum of digits of a number: " + sum);
    }
}
