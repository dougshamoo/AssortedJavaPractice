import java.util.Scanner;

public class GetLetterGrade {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the student's numerical grade: ");
    double grade = input.nextDouble();
    String letterGrade = "";
    if (grade > 90) {
      letterGrade = "A";
    }
    else if (grade > 80) {
      letterGrade = "B";
    }
    else if (grade > 70) {
      letterGrade = "C";
    }
    else if (grade > 60) {
      letterGrade = "D";
    }
    else {
      letterGrade = "F";
    }
    String article = "a";
    if (letterGrade == "A") {
      article = "an";
    }
    System.out.println("Give this student " + article + " " + letterGrade);
  }
}