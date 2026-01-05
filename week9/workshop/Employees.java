package week9.workshop;


/**
 * Write a description of class Employees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employees
{
    protected int employeeID;
    protected String name;
    protected int basicSalary;
    
    public Employees(int employeeID,String name,int basicSalary)
    {
        this.employeeID=employeeID;
        this.name=name;
        this.basicSalary=basicSalary;
    }
    
    double calculateBonus()
    {
        return(0.1*basicSalary);
    }
    
    void displayEmployee()
    {
        System.out.println("The ID of this employee is :"+employeeID);
        System.out.println("The name of this employee is :"+name);
        System.out.println("The basic salary of this employee is :"+basicSalary);
    }
}