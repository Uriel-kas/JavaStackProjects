package chapterFive.exercise;

public class Factorials {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d! = %d%n", i, factorial(i));
        }
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
