import java.util.Scanner;

public class BreakContinue
{
  public static void main(String[] args)
  {
    /* String spaces = "There are spaces in this string";
    int numSpaces = 0;
    for (int i = 0; i < (spaces.length()); i++) {
      if (spaces.charAt(i) != ' ')
        continue;
      ++numSpaces;
    }
    System.out.println("There are " + numSpaces + " spaces."); */
    
    /* Scanner input = new Scanner(System.in);
    int number = 7;
    int guess;
    while (true) {
      System.out.print("Enter your guess: ");
      guess = input.nextInt();
      if (guess == number) {
        System.out.println("You win!");
        break;
      }
      System.out.println("Wrong! Try Again.");
    } */
    
    String answer = "Watson";
    String response = "";
    int tries = 0;
    Scanner input = new Scanner(System.in);
    while (tries < 3) {
      System.out.print("What is the name of the computer that played Jeopardy? ");
      response = input.nextLine();
      tries ++;
      if (response.equals(answer)) {
        System.out.println("Correct! You win!");
        break;
      } 
      else if (tries == 3) {
        System.out.println("You lose! Suck it.");
        break;
      }
      System.out.println("Incorrect. Try again.");
    }
  }
}