package chapterSix;

import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalCharges = 0.0;
        System.out.print("Enter hours parked (or -1 to quit): ");
        double hours = input.nextDouble();
        while (hours != -1) {
            double charge = calculateCharges(hours);
            System.out.printf("Customer's charge: $%.2f\n", charge);
            totalCharges += charge;

            System.out.print("Enter hours parked (or -1 to quit): ");
            hours = input.nextDouble();
        }
        System.out.printf("Total receipts for yesterday: $%.2f\n", totalCharges);
    }

    public static double calculateCharges(double hours) {
        double charge = 2.0; // minimum charge for up to 3 hours
        if (hours > 3.0) {
            // add $0.50 for each additional hour or part thereof
            charge += Math.min(Math.ceil(hours - 3.0), 21.0) * 0.5;
        }
        // maximum charge for any given 24-hour period is $10.00
        return Math.min(charge, 10.0);
    }
}

