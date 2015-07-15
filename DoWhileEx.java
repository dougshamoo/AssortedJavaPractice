public class DoWhileEx
{
   /*

   do {
      set of statements;
   } while (relational expression);
   
   */

   public static void main(String[] args)
   {
      int number = 1;
      do {
         System.out.println(number);
         number ++;
      } while (number < 11);    // same as (number <= 10)
   }
}