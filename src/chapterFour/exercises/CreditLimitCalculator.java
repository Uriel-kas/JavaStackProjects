package chapterFour.exercises;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input number of customers
        System.out.print("Enter number of customers: ");
        int numCustomers = input.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            // input customer information
            System.out.println("\nCustomer " + i);
            System.out.print("Account number: ");
            int acctNum = input.nextInt();
            System.out.print("Beginning balance: ");
            int beginningBal = input.nextInt();
            System.out.print("Total items charged: ");
            int totalCharges = input.nextInt();
            System.out.print("Total credits applied: ");
            int totalCredits = input.nextInt();
            System.out.print("Allowed credit limit: ");
            int creditLimit = input.nextInt();

            // calculate new balance
            int newBalance = beginningBal + totalCharges - totalCredits;

            // output new balance and credit limit status
            System.out.println("New balance: " + newBalance);
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
        }
    }
}
