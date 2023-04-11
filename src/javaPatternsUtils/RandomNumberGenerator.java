package javaPatternsUtils;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        int n;
        int max;
        int num;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of random numbers you want: ");
        n = input.nextInt();
        System.out.print("Enter the maximum value of random number: ");
        max = input.nextInt();
        Random t = new Random();
        System.out.println("Random numbers from 0 to " + max + " are: ");
        for (c = 1; c <= n; c++) {
            System.out.println(t.nextInt(max));
        }
    }
}
