package chapterTwo;

import java.util.Scanner;

// This program will calculate the product of three integers
public class TresInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;

        System.out.print("Enter the first integer: ");
        x = input.nextInt();

        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        System.out.print("Enter the third integer: ");
        z = input.nextInt();

        System.out.printf("%s%d", "Product is: ", x*y*z);
    }
}
