package javaPatternsUtils;

import java.util.Scanner;

public class CountTheDigitInANumber {

    public static void main(String[] args) {
        int num;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.print("Total digits is: " + count);
    }
}
