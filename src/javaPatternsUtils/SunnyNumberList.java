package javaPatternsUtils;

import java.util.Scanner;

public class SunnyNumberList {

    public static void main(String[] args) {
        double x;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (upper limit): ");
        int limit = input.nextInt();
        System.out.println("Sunny numbers between 1 to "+limit);
        for (int i = 1; i <= limit; i++) {
            x = Math.sqrt(i + 1);
            if ((int)x == x) {
                System.out.println(i+"");
            }
        }
    }
}
