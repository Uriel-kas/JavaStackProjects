package chapterFive.exercise;

public class PiSeries {

    public static void calculatePiSeries() {
        double pi = 4;
        System.out.printf("Term       Value%n");
        int power = 1;
        for (power = 1; power <= 200_000; power++){
            pi = pi + Math.pow(-1, power) * 4 / (1 + (power * 2));
            System.out.printf("%d       %f%n", power, pi);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        calculatePiSeries();
    }
}
