package javaPatternsUtils;

import java.util.Scanner;

public class HappyNumber {

    public static void main(String[] args) {
        int num;
        int temp;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        while (sum != 1 && sum != 4) {
            sum = 0;
            while (num > 0) {
                temp = num % 10;
                sum += (temp * temp);
                num /= 10;
            }
            num = sum;
        }
        if (sum == 1) {
            System.out.print("Happy number.");
        } else {
            System.out.print("Unhappy number.");
        }
    }
}
