package week9.workshop;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employees
{
    private int houseRentAllowance;
    private int dearnessAllowance;
    
    public PermanentEmployee(int employeeID,String name,int basicSalary,int houseRentAllowance,int dearnessAllowance)
    {
        super(employeeID,name,basicSalary);
        this.houseRentAllowance=houseRentAllowance;
        this.dearnessAllowance=dearnessAllowance;
    }
    
    double calculateTotalSalary()
    {
        double total= basicSalary+ houseRentAllowance + dearnessAllowance + calculateBonus();
        return total;
    }
    
}