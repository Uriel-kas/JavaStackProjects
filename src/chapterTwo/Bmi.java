package chapterTwo;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double weightInKg;
        double heightInFeet;

        System.out.print("What is your Weight(KG): ");
        weightInKg = s.nextDouble();

        System.out.print("What is your Height(Ft): ");
        heightInFeet = s.nextDouble();

        double BMI = (weightInKg)/heightInFeet * 2;
        System.out.println("BMI Values: "+ BMI);

        if (BMI <= 18.5) {
            System.out.println("You are Underweight.");
        }
        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("You are Normal.");
        }
        if (BMI >= 24.9 && BMI <= 29.9) {
            System.out.println("You are Overweight.");
        }
        if (BMI >= 30) {
            System.out.println("You are Obese bayi. Hit the Gym Edakun!!!");
        }

    }
}
