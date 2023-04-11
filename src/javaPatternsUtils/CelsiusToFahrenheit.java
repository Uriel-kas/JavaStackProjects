package javaPatternsUtils;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        float c;
        float f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp in centigrade: ");
        c = input.nextFloat();
        f = (float)((1.8 * c) + 32.0);
        System.out.print("Temperature in Fahrenheit = " + f);
    }
}
