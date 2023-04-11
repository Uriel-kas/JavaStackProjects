package chapterFive.exercise;

import java.util.Scanner;

public class CustomerSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String prompt = "Enter 1 for product 1\n" +
                        "Enter 2 for product 2\n" +
                        "Enter 3 for product 3\n" +
                        "Enter 4 for product 4\n" +
                        "Enter 5 for product 5\n" +
                        "Enter 0 to terminate\n";

        double price;
        double totalQuantitySold = 0;

        System.out.println(prompt);
        int userInput = input.nextInt();
//        int quantitySold = input.nextInt();

        while(userInput != 0 && userInput <= 5){
            System.out.print("Enter quantity sold: ");
            int quantitySold = input.nextInt();

            switch(userInput){
                case 1:
                    price = 2.98;
                    totalQuantitySold += price * quantitySold;
                    System.out.println(totalQuantitySold);
                    break;
                case 2:
                    price = 4.50;
                    totalQuantitySold += price * quantitySold;
                    System.out.println(totalQuantitySold);
                    break;
                case 3:
                    price = 9.98;
                    totalQuantitySold += price * quantitySold;
                    System.out.println(totalQuantitySold);
                    break;
                case 4:
                    price = 4.49;
                    totalQuantitySold += price * quantitySold;
                    System.out.println(totalQuantitySold);
                    break;
                case 5:
                    price = 6.87;
                    totalQuantitySold += price * quantitySold;
                    System.out.println(totalQuantitySold);
                    break;
                default:
                    System.out.print("Enter a valid input");
            }
            System.out.println(prompt);
            userInput = input.nextInt();
        }
        System.out.println("Your retail total is " + totalQuantitySold);
    }
}
