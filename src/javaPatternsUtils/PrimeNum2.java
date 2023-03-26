package javaPatternsUtils;

import java.util.Scanner;

public class PrimeNum2 {
    public static void main(String[] args) {
        int i;
        int j = 2;
        int ch = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("ENTER ANY NUMBER: ");
        i = input.nextInt();

        if(i <= 1){
            ch = 1;
        }

        while (j <= i/2) {
            if(i % j == 0) {
                ch = 1;
                break;
            } else {
                j++;
            }
        }

        if(ch == 0){
            System.out.printf("%n%d IS PRIME.%n", i);
        } else {
            System.out.printf("%d IS NOT PRIME.%n", i);
        }
    }
}
