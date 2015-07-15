import java.util.Scanner;

/*
   switch(integral expression) {
      case (expression):
         set of statements;
         break;
      case (expression):
         set of statements;
         break;
      default:
         set of statements;
    }
*/

public class SwitchExercise2
{
   public static void main(String[] args)
   {
      char letter;
      String letterGrade;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter grade: ");
      letterGrade = input.nextLine();
      letter = letterGrade.charAt(0);
      switch(letter) {
         case 'A':
         case 'B':   // The "Drop-through"
         case 'C':
            System.out.println("Pass");
            break;
         case 'D':
         case 'F':
            System.out.println("Fail");
            break;
         default:
            System.out.println("Bad input");
      }
   }
}