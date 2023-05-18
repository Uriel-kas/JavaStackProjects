package javaPatternsUtils;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        int radius;
        float area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius the circle: ");
        radius = input.nextInt();
        area = (float) (3.14 * radius * radius);
        System.out.print("Area of the circle: " + area);
    }
}
