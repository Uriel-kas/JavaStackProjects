package javaPatternsUtils;

import java.util.Scanner;

public class EvilList {

    public static void main(String[] args) {
        int num;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (upper limit): ");
        int limit = input.nextInt();
        System.out.println("Evil numbers between 1 to " + limit);
        for (int i = 1; i <= limit; i++) {
            num = i;
            count = 0;
            while (num != 0) {
                if (num % 2 == 1) {
                    count++;
                }
                num /= 2;
            }
            if (count % 2 == 0) {
                System.out.println(i+"");
            }
        }
    }
}
