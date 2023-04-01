package javaPatternsUtils;

import java.util.Scanner;

public class FactorialNumbers {

    public static void main(String[] args) {
        int n;
        int cn;
        int fact;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();

        System.out.println("\nFactorial of numbers between 1 to "+n+" : ");
        System.out.println("Number : Factorial");
        for (int i = 1; i <= n; i++) {
            cn = i;
            fact = 1;
            for (int j = 1; j <= cn; j++) {
                fact *= j;
            }
            System.out.printf("%6d : %d\n",cn, fact);
        }
    }
}
