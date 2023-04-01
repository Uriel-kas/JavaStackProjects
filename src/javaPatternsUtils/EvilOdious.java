package javaPatternsUtils;

import java.util.Scanner;

public class EvilOdious {

    public static void main(String[] args) {
        int num;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        num = input.nextInt();

        while (num != 0) {
            if (num % 2 == 1) {
                count++;
            }
            num /= 2;
        }
        if (count % 2 == 0) {
            System.out.print("Evil number.");
        } else {
            System.out.print("Odious number.");
        }
    }
}
