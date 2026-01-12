package week10.WORKSHOP10;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends person
{
    private String specialization;
    private int consultationFee;
    public Doctor(int id,String name,String specialization,int consultationFee)
    {
        super(id,name);
        this.specialization=specialization;
        this.consultationFee=consultationFee;
    }
    
    public String get_specialization()
    {
        return this.specialization;
    }
    
    public void set_specialization()
    {
        this.specialization=specialization;
    }
    
    public int get_consulationFee()
    {
        return this.consultationFee;
    }
    
    public void set_consultationFee()
    {
        this.consultationFee=consultationFee;
    }
    @Override
    public double calculateSalary()
    {
        double basePay=super.calculateSalary();
        return basePay+this.consultationFee*30;
    }
    
    @Override
    public String toString()
    {
        
        return super.toString()+"Doctor details--> doctor specializatoin :" +get_specialization() +"consultationFee :"+get_consulationFee();
    }
    
    public double calculateSalary(int emergencyCases)
    {
        double basePay=super.calculateSalary();
        return this.calculateSalary()+emergencyCases*1000;
    }
}