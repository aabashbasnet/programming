package week9.workshop;


/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll
{
    public static void main(String[] args)
    {
        PermanentEmployee pe1=new PermanentEmployee(001,"Aabash",50000,20000,5000);
        pe1.displayEmployee();
        double totalsalary=pe1.calculateTotalSalary();
        System.out.println("The total salary of this employee is :"+totalsalary);
        ContractEmployee ce1=new ContractEmployee(002,"Aabash2",40000,27);
        ce1.displayEmployee();
        double totalsalary2=ce1.calculateTotalSalary();
        System.out.println("The total salary of this employee is :"+totalsalary2);
        
    }
}