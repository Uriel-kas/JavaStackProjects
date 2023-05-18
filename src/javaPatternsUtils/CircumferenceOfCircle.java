package javaPatternsUtils;

import java.util.Scanner;

public class CircumferenceOfCircle {

    public static void main(String[] args) {
        int radius;
        float cir;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of the Circle: ");
        radius = input.nextInt();
        cir = (float) (2 * 3.14 * radius);
        System.out.print("Circumference of the Circle: " + cir);
    }
}
