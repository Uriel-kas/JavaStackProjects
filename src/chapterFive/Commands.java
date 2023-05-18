package chapterFive;

import java.util.Scanner;

public class Commands {

    public static void main(String[] args) {
        Scanner inputCommands = new Scanner(System.in);
        System.out.print("Enter a command: ");
        String commands = inputCommands.nextLine();

        switch (commands) {
            case "help":
                System.out.println("These are commands options...");
                break;
            case "quit":
                System.out.println("Program quitting...");
                System.exit(0);
                break;
            default:
                System.out.println("Unknown command...");
                break;
        }
    }
}
