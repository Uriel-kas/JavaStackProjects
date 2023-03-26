package javaPatternsUtils;

import java.util.Scanner;

public class SwapTwoNums {
    public static void main(String[] args) {
        int x;
        int y;
        int temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of x and y: \n");
        x = input.nextInt();
        y = input.nextInt();

        System.out.println("Before Swapping\n x = " + x + "\n y = " + y);
        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping\n x = " + x + "\n y = " + y);
    }
}
