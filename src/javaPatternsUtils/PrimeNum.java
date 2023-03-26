package javaPatternsUtils;

import java.util.Scanner;

public class PrimeNum  {
    public static void main(String[] args) {
        int n;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
            if(count == 2){
                System.out.printf("%n%d is a Prime number.%n",n);
            }
            else {
                System.out.printf("%n%d is not a Prime number.%n", n);
            }
        }
    }
}
