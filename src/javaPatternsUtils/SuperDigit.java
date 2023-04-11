package javaPatternsUtils;

import java.util.Scanner;

public class SuperDigit {

    public static void main(String[] args) {
        int n;
        int x;
        int s;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = input.nextInt();
        while (n >= 10) {
            x = n;
            s = 0;
            while (x > 0) {
                s = s + (x % 10);
                x /= 10;
            }
            n = s;
        }
        System.out.print("Super Digit of the given number is " + n);
    }
}
