package javaPatternsUtils;

import java.util.Scanner;

public class DisariumNumberList {

    public static boolean isDisarium(int n) {
        int dc = digitCount(n);
        int pd;
        int sum = 0;
        int t = n;

        while (t != 0) {
            pd = t % 10;
            sum = sum + (int)Math.pow(pd, dc--);
            t /= 10;
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static int digitCount(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int i;
        int limit;
        int sum = 0;
        int digitCount = 0;
        int pd;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (upper limit): ");
        limit = input.nextInt();
        System.out.println("Disarium numbers between 1 to "+limit);

        for (i = 1; i <= limit; i++) {
            if (isDisarium(i)) {
                System.out.println(i+"");
            }
        }
    }
}
