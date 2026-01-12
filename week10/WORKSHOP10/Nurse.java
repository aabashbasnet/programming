package week10.WORKSHOP10;


/**
 * Write a description of class Nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends person
{
    private String shift;
    private double extraAllowance;
    
    public Nurse(int id,String name,String shift,double extraAllowance)
    {
        super(id,name);
        this.shift=shift;
        this.extraAllowance=extraAllowance;
    }
    
    
    @Override
    public double calculateSalary()
    {
        double basePay=super.calculateSalary();
        return basePay+extraAllowance;
    }
    
    public String get_shift()
    {
        return this.shift;
    }
    
    public void set_shift()
    {
        this.shift=shift;
    }
    
    public double get_extraAllowance()
    {
         return this.extraAllowance;   
    }
    
    public void set_extraAllowance()
    {
        this.extraAllowance=extraAllowance;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"Nurse details--> shift :" +get_shift() +"extraAllowance :"+ get_extraAllowance();
    }
}