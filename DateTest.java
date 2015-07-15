public class DateTest
{
   public static void main(String[] args)
   {
      Date today = new Date(11, 4, 2014);
      Date tomorrow = new Date(11, 2014);
      System.out.println("today is " + today.toString());
      System.out.println("tomorrow is " + tomorrow.toString());
      tomorrow.setDay(5);
      System.out.println("tomorrow is " + tomorrow.toString());
      System.out.println("today is again " + today.getMonth() + "/" +
                          today.getDay() + "/" + today.getYear());
   }
}