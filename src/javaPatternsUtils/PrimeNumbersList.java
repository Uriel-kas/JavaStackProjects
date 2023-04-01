package javaPatternsUtils;

import java.util.Scanner;

public class PrimeNumbersList {

    public static void main(String[] args) {
        int n;
        int cn;
        int count;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();

        System.out.println("\nList of Prime numbers between 1 to "+n+":");
        for (int i = 1; i <= n; i++) {
            cn = i;
            count = 0;
            for (int j = 1; j <= cn; j++) {
                if (cn % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(""+cn);
            }
        }
    }
}
