package javaPatternsUtils;

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {
        int n;
        int num;
        int sq;
        int r;
        int t;

        boolean equal = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();

        num = n;
        sq = n * n;
        t = 10;
        System.out.println("\nSquare of "+n+" is "+sq);
        while (n > 0) {
            r = sq % t;
            if (num == r) {
                equal = true;
                break;
            }
            n = n / 10;
            t = t * 10;
        }
        if (equal == true) {
            System.out.println(num+" is an Automorphic number.");
        } else {
            System.out.println(num+" is not an Automorphic number.");
        }
    }
}
