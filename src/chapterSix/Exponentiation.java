package chapterSix;
public class Exponentiation {
    public static void main(String[] args) {
        integerPower(2, 3);
    }

    public static void integerPower(int base, int exponent) {
        int result = base;
        for (int i = 1; i < exponent; i++) {
            result *= base;
        }
        System.out.printf("%d", result);
    }
}

