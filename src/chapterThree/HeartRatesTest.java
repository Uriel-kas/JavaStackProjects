package chapterThree;

import java.util.Scanner;
public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();
        System.out.print("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();
        HeartRates heartRates = new HeartRates(firstName, lastName, birthYear, birthMonth, birthDay);
        System.out.printf("%nName: %s %s%n", heartRates.getFirstName(), heartRates.getLastName());
        System.out.printf("Date of birth: %d/%d/%d%n", heartRates.getBirthMonth(), heartRates.getBirthDay(), heartRates.getBirthYear());
        System.out.printf("Age: %d%n", heartRates.calculateAge());
        System.out.printf("Maximum heart rate: %d bpm%n", heartRates.calculateMaxHeartRate());
        int[] targetHeartRate = heartRates.calculateTargetHeartRate();
        System.out.printf("Target heart rate: %d-%d bpm%n", targetHeartRate[0], targetHeartRate[1]);
        scanner.close();
    }
}
