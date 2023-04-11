package javaPatternsUtils;

import java.util.Scanner;

public class PronicNumberList {

    public static void main(String[] args) {
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (upper limit): ");
        int limit = input.nextInt();

        for (int i = 0; i <= limit; i++) {
            flag = false;
            for (int n = 0; n <= i; n++) {
                if (n * (n + 1) == i) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(i+"");
            }
        }
    }
}
