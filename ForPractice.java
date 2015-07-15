public class ForPractice
{
  public static void main(String[] args)
  {
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello, world!");
    }
    for (int i = 1; i <= 10; i += 2) {
      System.out.println(i);
    }
    for (int i = 1; i <= 10; i ++) {
      sum += i;
      System.out.println(sum);
    }
  }
}