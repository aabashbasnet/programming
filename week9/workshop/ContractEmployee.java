package week9.workshop;


/**
 * Write a description of class ContractEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmployee extends Employees
{
    private int workingDays;
    
    public ContractEmployee(int employeeID,String name,int basicSalary,int workingDays)
    {
        super(employeeID,name,basicSalary);
        this.workingDays=workingDays;
    }
    
    double calculateTotalSalary()
    {
        double total=basicSalary*workingDays;
        return total;
    }
}