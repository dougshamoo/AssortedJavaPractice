import java.util.Scanner;

public class ScannerInput
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double number1, number2, sum;
      System.out.print("Enter number1:");
      number1 = input.nextDouble();
      System.out.print("Enter number2:");
      number2 = input.nextDouble();
      sum = number1 + number2;
      System.out.println("Sum = " + sum);
   }

}