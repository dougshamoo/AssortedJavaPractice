import java.util.Scanner;

public class MethodCalc
{
  public static void main(String[] args)
  {
    double num1, num2;
    String op;
    Scanner inputNum1 = new Scanner(System.in);
    Scanner inputNum2 = new Scanner(System.in);
    Scanner inputOp = new Scanner(System.in);

    System.out.print("Enter first number: ");
    num1 = inputNum1.nextDouble();
    System.out.print("Enter second number: ");
    num2 = inputNum2.nextDouble();
    System.out.print("Enter operation (+, -, *, /): ");
    op = inputOp.next();
    
    if (op.equals("+"))
       System.out.println(add(num1, num2));
    else if (op.equals("-"))
       System.out.println(subtract(num1, num2));
    else if (op.equals("*"))
       System.out.println(multiply(num1, num2));
    else if (op.equals("/"))
       System.out.println(divide(num1, num2));
    else
       System.out.println("Operation not recognized");
  }

  static double add(double num1, double num2) {
    return num1 + num2;
  }

  static double subtract(double num1, double num2) {
    return num1 - num2;
  }

  static double multiply(double num1, double num2) {
    return num1 * num2;
  }

  static double divide(double num1, double num2) {
    return num1 / num2;
  }
}