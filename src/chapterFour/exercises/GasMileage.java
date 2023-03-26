package chapterFour.exercises;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        int miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            int gallonsUsed = input.nextInt();

            double milesPerGallon = (double) miles / gallonsUsed;
            System.out.printf("Miles per gallon for this trip: %.2f\n", milesPerGallon);

            totalMiles += miles;
            totalGallons += gallonsUsed;

            double combinedMilesPerGallon = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon up to this point: %.2f\n", combinedMilesPerGallon);

            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }
    }
}

