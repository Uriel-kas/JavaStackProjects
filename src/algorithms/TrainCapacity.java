package algorithms;

import java.util.Scanner;

public class TrainCapacity {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter maximum capacity of train: ");
        int maxCapacity = input.nextInt();
        System.out.print("Enter size of carriage: ");
        int size = input.nextInt();
        System.out.print("Enter values for each carriage: ");
        int[] carriage = new int[size];
        for (int i = 0; i < carriage.length; i++) {
            carriage[i] = input.nextInt();
        }
        findSeat(maxCapacity, carriage);
    }

    private static void findSeat(int maxCapacity, int [] carriage){
        int expectedCapacityOfCarriage = maxCapacity / carriage.length;
        int halfCapacityOfCarriage = expectedCapacityOfCarriage / 2;
        for (int i = 0; i < carriage.length; i++) {
            int valueOfEachCarriage = carriage[i];
            if (halfCapacityOfCarriage == valueOfEachCarriage
                    || valueOfEachCarriage < halfCapacityOfCarriage) {
                System.out.println("Return " + i);
                return;
            }
        }
        System.out.println("Return " + -1);
    }
}
