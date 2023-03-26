package javaPatternsUtils;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for A: ");
        a = input.nextInt();

        System.out.print("Enter value for B: ");
        b = input.nextInt();

        System.out.print("\nValue of A and B before swapping is A: " + a +", B: " +b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print("\nvalue of A and B after swapping is A: " + a +", B: "+b);
    }
}
