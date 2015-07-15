import java.util.Scanner;

public class SimpleCalc
{
   public static void main(String[] args)
   {
      Scanner inputNum1 = new Scanner(System.in);
      Scanner inputNum2 = new Scanner(System.in);
      Scanner inputOp = new Scanner(System.in);
      double num1, num2;
      String op;
      while (true) {
         System.out.print("Enter Number1: ");
         num1 = inputNum1.nextDouble();
         System.out.print("Enter Number2: ");
         num2 = inputNum2.nextDouble();
         System.out.print("Enter Operator: ");
         op = inputOp.next();
         if (op.equals("+"))
            System.out.println(num1 + num2);
         else if (op.equals("-"))
            System.out.println(num1 - num2);
         else if (op.equals("*"))
            System.out.println(num1 * num2);
         else if (op.equals("/"))
            System.out.println(num1 / num2);
         else
            System.out.println("Operator not recognized.");
      }
   }
}