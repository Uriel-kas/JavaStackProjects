package javaPatternsUtils;

import java.util.Scanner;

public class SpyNumbersList {

    public static void main(String[] args) {
        int up;
        int lw;
        int n;
        int sum = 0, prod = 1;
        int d;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number (lower limit): ");
        lw = input.nextInt();
        System.out.print("Enter the ending number (upper limit): ");
        up = input.nextInt();
        System.out.println("\nList of Spy numbers betwwen "+lw+" - "+up+": ");
        for (int i = lw; i <= up; i++) {
            sum = 0;
            prod = 1;
            n = i;
            while (n > 0) {
                d = n % 10;
                sum += d;
                prod *= d;
                n /= 10;
            }
            if (sum == prod) {
                System.out.println(""+i);
            }
        }
    }
}
