package algorithms.assignments;

import java.util.Scanner;

public class RockPaperScissors {

  private static String getWinner(String player1, String player2){

      switch (player1){
          case "rock":
              if (player2.equals("paper")){
                  return "Player 2 wins";
              } else if(player2.equals("scissors")){
                  return "Player 1 wins";
              } else {
                  return "Tie";
              }
          case "paper":
              if (player2.equals("scissors")){
                  return "Player 2 wins";
              } else if(player2.equals("rock")){
                  return "Player 1 wins";
              } else {
                  return "it is a Tie";
              }
          case "scissors":
              if (player2.equals("rock")){
                  return "player 2 wins";
              } else if(player2.equals("paper")){
                  return "player 1 wins";
              } else {
                  return "Nice guess, it is a Tie";
              }
          default:
              return "Invalid input";
      }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Player 1, enter your choice (rock, paper, or scissors): ");
    String player1 = scanner.nextLine();

    System.out.print("Player 2, enter your choice (rock, paper, or scissors): ");
    String player2 = scanner.nextLine();

    String result = getWinner(player1, player2);
    System.out.println(result);
  }
}
