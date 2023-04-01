package javaPatternsUtils;

import java.util.Scanner;

public class TrimorphicNumber {

    public static void main(String[] args) {
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int cube = n * n * n;

        while (n != 0) {
            if (n % 10 != cube % 10) {
                flag = false;
                break;
            }
            n /= 10;
            cube /= 10;
        }
        if (flag) {
            System.out.print("Number is a Trimorphic Number.");
        } else {
            System.out.print("Number is not a Trimorphic Number.");
        }
    }
}
