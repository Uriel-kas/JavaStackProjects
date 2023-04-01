package javaPatternsUtils;

import java.util.Scanner;

public class SpyNumber {

    public static void main(String[] args) {
        int n, sum = 0, prod = 1;
        int d;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();

        while (n > 0) {
            d = n % 10;
            sum += d;
            prod *= d;
            n = n / 10;
        }
        if (sum == prod) {
            System.out.println("Given number is a Spy number.");
        } else {
            System.out.println("Given number is not a Spy number.");
        }
    }
}
