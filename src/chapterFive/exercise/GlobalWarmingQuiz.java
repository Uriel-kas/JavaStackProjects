package chapterFive.exercise;

import java.util.Scanner;

public class GlobalWarmingQuiz {

  public void displayQuestion() {
    String questionOne =
        "Major substances involved with global warming include all of the following except:\n"
            + "A. N2O\n"
            + "B. CFCs\n"
            + "C. CO2\n"
            + "D. CH4\n";
    System.out.println(questionOne);
    String questionTwo =
        "What molecules have been increasing in the atmosphere for decades and have contributed to an elevated global temperature?\n"
            + "A. ammonium sulfate\n"
            + "B. sulfur dioxide\n"
            + "C. carbon dioxide\n"
            + "D. hydrofluorocarbons\n";
    System.out.println(questionTwo);
    String questionThree =
        "Which of the following contributes to global warming?\n"
            + "A. nitrogen\n"
            + "B. carbon dioxide\n"
            + "C. helium\n"
            + "D. chlorine\n";
    System.out.println(questionThree);
    String questionFour =
        "Which of the following is MOST often cited for global warming?\n"
            + "A. increased levels of CFC chemicals\n"
            + "B. increased levels of carbon dioxide\n"
            + "C. decreased levels of atmospheric ozone\n"
            + "D. decreased levels of dissolved oxygen\n";
    System.out.println(questionFour);
    String questionFive =
        "Which of the following countries did NOT participate in developing the Copenhagen Accord?\n"
            + "A. Russia\n"
            + "B. Brazil\n"
            + "C. China\n"
            + "D. India\n";
    System.out.println(questionFive);
  }

  public void scorer(int counter) {
    if (counter == 5) {
      System.out.println("Excellent!");
    } else if (counter == 4) {
      System.out.println("Good job!");
    } else if (counter >= 3) {
      System.out.println(
          "Time to brush up on your knowledge of global warming\n"
              + "Check out these websites:\n"
              + "https://quizlet.com/269341095/chapter-21-changes-in-ecosystems-flash-cards/\n"
              + "https://unfccc.int/process/conferences/pastconferences/copenhagen-climate-change-conference-december-2009/statements-and-resources/information-provided-by-parties-to-the-convention-relating-to-the-copenhagen-accord\n");
    }
  }

  public static void main(String[] args) {
    GlobalWarmingQuiz gb = new GlobalWarmingQuiz();
    gb.displayQuestion();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your answers");
    int counter = 0;
    System.out.println("Enter answer for question one: ");
    String userAnswer1 = input.next();
    input.nextLine();
    System.out.println("Enter answer for question two: ");
    String userAnswer2 = input.next();
    input.nextLine();
    System.out.println("Enter answer for question three: ");
    String userAnswer3 = input.next();
    input.nextLine();
    System.out.println("Enter answer for question four");
    String userAnswer4 = input.next();
    input.nextLine();
    System.out.println("enter answer for question five");
    String userAnswer5 = input.next();

    if (userAnswer1.equals("B") || userAnswer1.equals("b")) {
      counter += 1;
    }
    if (userAnswer2.equals("C") || userAnswer2.equals("c")) {
      counter += 1;
    }
    if (userAnswer3.equals("B") || userAnswer3.equals("b")) {
      counter += 1;
    }
    if (userAnswer4.equals("B") || userAnswer4.equals("b")) {
      counter += 1;
    }
    if (userAnswer5.equals("A") || userAnswer5.equals("a")) {
      counter += 1;
    }

    gb.scorer(counter);
  }
}
