package week9.workshop;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    protected int id;
    protected int basicSalary;
    protected static String collegeName;
    
    public Person(int id,int basicSalary,String collegeName)
    {
        this.id=id;
        this.basicSalary=basicSalary;
        this.collegeName=collegeName;
    }
    
    double calculateAnnualSalary()
    {
        return(basicSalary*12);
    }
    
    String getcollegeName()
    {
        return this.collegeName;
    }
}