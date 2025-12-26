package Week7.W8WORKSHOP;


/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    public static void main(String[] args)
    {
        Employee e1=new Employee(1000);
        
        double gross= e1.calculateGrossSalary();
        System.out.println("The gross salary is "+gross);
    }
}