package javaPatternsUtils;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        int a,b;
        int d = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any no: ");
        a = input.nextInt();
        while (a > 0) {
            b = a % 10;
            a = a / 10;
            d = (d * 10) + b;
        }
        System.out.print("reverse is: " + d);
    }
}
