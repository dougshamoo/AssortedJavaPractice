public class EmployeeExample
{
   public static void main(String[] args)
   {
      /* Employee e1 = new Employee("Brown", 30000);
      Manager m1 = new Manager("Smith", 50000, "Sales");

      System.out.println(e1.display());
      System.out.println(m1.display()); */

      Employee e1 = new Employee("Jones", 20000);
      Manager m1 = new Manager("Smith", 40000, "IT");
      System.out.println(e1.display());
      m1.changeSalary(e1, 30000);
      System.out.println(e1.display());
   }
}