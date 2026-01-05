package week9.workshop;


/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff
{
    private int workingHours;
    private float ratePerHour;
    
    double calculateSalary()
    {
        return(workingHours*ratePerHour);
    }
    
}