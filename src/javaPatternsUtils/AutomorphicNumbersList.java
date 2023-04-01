package javaPatternsUtils;

import java.util.Scanner;

public class AutomorphicNumbersList {

    public static void main(String[] args) {
        int n;
        int cn, num;
        int sq;
        int r;
        int t;
        boolean equal;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();

        System.out.println("List of Automorphic numbers between 1 to "+n+":");
        for (int i = 1; i <= n; i++) {
            cn = i;
            num = i;
            sq = cn * cn;
            t = 10;
            equal = false;

            while (cn > 0) {
                r = sq % t;
                if (num == r) {
                    equal = true;
                    break;
                }
                cn /= 10;
                t *= 10;
            }
            if (equal == true) {
                System.out.printf("%5d : %d\n",num, sq);
            }
        }
    }
}
