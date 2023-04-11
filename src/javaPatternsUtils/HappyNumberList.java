package javaPatternsUtils;

import java.util.Scanner;

public class HappyNumberList {

    public static void main(String[] args) {
        int num;
        int temp;
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (upper limit): ");
        int limit = input.nextInt();
        for (int i = 1; i <= limit; i++) {
            num = i;
            sum = 0;
            while (sum != 1 && sum != 4) {
                sum = 0;
                while (num > 0) {
                    temp = num % 10;
                    sum += (temp * temp);
                    num = num / 10;
                }
                num = sum;
            }
            if (sum == 1) {
                System.out.println(i+"");
            }
        }
    }
}
