public class Manager extends Employee
{
   private String department;

   Manager(String n, int s, String d) {
      super(n, s);
      department = d;
   }

   public String getDepartment() {
      return department;
   }
   
   // overriding a method
   public String display() {
      String empinfo = super.display();
      return empinfo + "Department: " + department + "\n";
   }

   public void changeSalary(Employee e, double amount) {
      e.salary = amount;
   }
}