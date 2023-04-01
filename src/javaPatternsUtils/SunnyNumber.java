package javaPatternsUtils;

import java.util.Scanner;

public class SunnyNumber {

    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();

        x = Math.sqrt(num + 1);
        if ((int)x == x) {
            System.out.println(num+" is a Sunny number.");
        } else {
            System.out.println(num+" is not a Sunny number.");
        }
    }
}
