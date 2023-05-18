package javaPatternsUtils;

import java.util.Scanner;

public class HcfGcd {

    static int hcf(int x, int y) {
        int i;
        for (i = x; i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int x;
        int y = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to find HCF/GCD (press 0 to exit): ");
        do {
            x = input.nextInt();
            if (y == -1) {
                y = hcf(x, y);
            } else {
                y = hcf(y, x);
            }
        } while (x >= 1);
        System.out.print("HCF/GCD is " + y);
    }
}
