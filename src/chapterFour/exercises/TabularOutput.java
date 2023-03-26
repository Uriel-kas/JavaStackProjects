package chapterFour.exercises;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N     10*N     100*N     1000*N");
        int n = 1;

        while (n <= 6) {
            System.out.printf("%d      %d      %d        %d%n", n, 10*n, 100*n, 1000*n);
            n++;
        }
    }

}
