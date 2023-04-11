package javaPatternsUtils;

import java.util.Scanner;

public class PowerOfGivenNumber {

    public static void main(String[] args) {
        int pow;
        int num;
        int i = 1;
        int sum = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.print("Enter power: ");
        pow = input.nextInt();
        while (i <= pow) {
            sum *= num;
            i++;
        }
        System.out.print("\n" + num + " to the power " + pow + " is: " + sum);
    }
}
