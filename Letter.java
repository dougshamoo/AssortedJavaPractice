import java.util.Scanner;

public class Letter
{
  public static void main(String[] args)
  {
    Scanner inputString = new Scanner(System.in);
    Scanner inputNumber = new Scanner(System.in);
    String name, present, yourName;
    int age;
    System.out.print("What is their name? ");
    name = inputString.nextLine();
    System.out.print("What did they give you? ");
    present = inputString.nextLine();
    System.out.print("How old are you? ");
    age = inputNumber.nextInt();
    System.out.print("What is your name? ");
    yourName = inputString.nextLine();
    System.out.println("\n");
    System.out.println("Dear " + name + ",");
    System.out.println();
    System.out.print("Thank you so much for the " + present + ". ");
    System.out.print("I can't believe that I'm already " + age + " years old. ");
    System.out.print("It doesn't feel that different from being " + (age-1) + " .");
    System.out.println();
    System.out.println("Sincerely,");
    System.out.println();
    System.out.println(yourName);
  }
}