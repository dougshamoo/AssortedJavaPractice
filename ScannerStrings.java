import java.util.Scanner;

public class ScannerStrings
{
  public static void main(String[] args)
  {
    String name;
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name: ");
    name = input.nextLine();
    System.out.print("Your name is " + name);
    
  }
}