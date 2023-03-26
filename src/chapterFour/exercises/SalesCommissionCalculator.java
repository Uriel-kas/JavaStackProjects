package chapterFour.exercises;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of items sold: ");
        int numOfItems = input.nextInt();
        double total = 0;

        int i = 1;
        while (i <= numOfItems) {
            System.out.printf("Enter value of Item %d: $", i);
            double valueOfItem = input.nextDouble();
            total += valueOfItem;
            i += 1;
        }

        double earnings = 200 + (0.9 * total);
        System.out.printf("%nSale's person earnings: $%.3f", earnings);
    }
}