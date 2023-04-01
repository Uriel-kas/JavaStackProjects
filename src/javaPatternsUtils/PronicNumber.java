package javaPatternsUtils;

import java.util.Scanner;

public class PronicNumber {

    public static void main(String[] args) {
        int num;
        int n;
        boolean flag = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        for (n = 0; n <= num; n++) {
            if (n * (n + 1) == num) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(num + " is a Pronic Number as it is the product of two consecutive numbers: " + n + " and "+ (n + 1));
        } else {
            System.out.println(num + " is not a Pronic Number.");
        }
    }
}
