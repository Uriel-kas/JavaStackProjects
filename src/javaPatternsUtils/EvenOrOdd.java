package javaPatternsUtils;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter on integer: "   );
        x = input.nextInt();

        if (x % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}
