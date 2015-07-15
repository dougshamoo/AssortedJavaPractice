import java.util.Scanner;

public class GradeAverage
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int grade, total = 0, count = 0;
    double average;
    System.out.print("Enter a grade (-1 to quit): ");
    grade = input.nextInt();
    while (grade != -1) {
      total += grade;
      count ++;
      System.out.print("Enter a grade (-1 to quit): ");
      grade = input.nextInt();
    }
    average = total / count;
    System.out.println("The average grade is: " + average);
    double averageSquared;
    System.out.println("The average squared is " + Math.pow(average, 2));
    System.out.println("The average grade is: " + Math.sqrt(Math.pow(average, 2)));
  }
}