package javaPatternsUtils;

import java.util.Scanner;

public class TrimorphicNumberList {

    public static boolean isTrimorphic(int n) {
        boolean flag = true;
        int cube = n * n * n;

        while (n != 0) {
            if (n % 10 != cube % 10) {
                flag = false;
                break;
            }
            n /= 10;
            cube /= 10;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (upper limit): ");
        int limit = input.nextInt();
        System.out.println("Trimorphic numbers from 1 to "+limit);
        for (int i = 1; i <= limit; i++) {
            if (isTrimorphic(i)) {
                System.out.println(i+"");
            }
        }
    }
}
