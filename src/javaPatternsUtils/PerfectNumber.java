package javaPatternsUtils;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n;
        int i = 1;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = input.nextInt();
        while (i < n) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == n) {
            System.out.print(i+" is a perfect number.");
        } else {
            System.out.print(i+" is not a perfect number.");
        }
    }
}
