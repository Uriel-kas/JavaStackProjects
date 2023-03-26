package javaPatternsUtils;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            fact *= i;
        }

        System.out.printf("Factorial of %d is %d", n, fact);
    }
}
