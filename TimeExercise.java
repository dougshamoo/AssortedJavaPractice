public class TimeExercise
{
   public static void main(String[] args)
   {
      /* Time theTime = new Time();
      System.out.println(theTime.getHours());
      theTime.setHours(6);
      System.out.println(theTime.getHours()); */

      /* Time theTime = new Time(6, 5, 9);
      System.out.println(theTime.toString());
      System.out.println(theTime.display()); */
      
      /* Time theTime = new Time();
      theTime.setTime(13, 2, 0);
      System.out.println(theTime.display());
      theTime.setHours(15); 
      System.out.println(theTime.display());
      System.out.println("The hours is: " + theTime.getHours()); */

      /* Time theTime = new Time(9,0,0);
      System.out.println(theTime.display());
      theTime.increment(1);
      System.out.println(theTime.display());
      theTime.increment(30);
      System.out.println(theTime.display());
      theTime.increment(40);
      System.out.println(theTime.display());
      theTime.increment(70);
      System.out.println(theTime.display());
      theTime.increment(123);
      System.out.println(theTime.display()); */

      Time theTime = new Time(9,1,0);
      Time aTime = new Time(9,0,0);
      if (theTime.equals(aTime))
          System.out.println("The same time.");
      else
          System.out.println("Different time.");
   }
}