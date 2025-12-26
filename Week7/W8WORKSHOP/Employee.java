package Week7.W8WORKSHOP;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private double basicSalary;
    
    public Employee(double basicSalary)
    {
        this.basicSalary=basicSalary;
    }
    
    void setbasicSalary(double basicSalary)
    {
        this.basicSalary=basicSalary;
    }
    
    double getbasicSalary()
    {
        return basicSalary;
    }

    
    double calculateGrossSalary()
    {
        double grossSalary=basicSalary+0.2*basicSalary;
        return grossSalary;
    }
    
}