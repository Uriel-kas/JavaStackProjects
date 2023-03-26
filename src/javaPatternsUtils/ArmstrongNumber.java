package javaPatternsUtils;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num;
        int temp;
        int sum;
        int i = 1;
        int n = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        num = input.nextInt();
        sum = 0;
        i = num;

        while (num > 0) {
            n = num % 10;
            num = num / 10;
            sum = sum + (n * n * n);
        }
        if (sum == i) {
            System.out.print(i+" is an ARMSTRONG Number.");
        } else {
            System.out.print(i+" is not an ARMSTRONG Number.");
        }
    }
}
