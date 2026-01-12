package week10.WORKSHOP10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int partnerId;
    private String name;
    private int basePay;
    
    public DeliveryPartner(int partnerId,String name,int basePay)
    {
        this.partnerId=partnerId;
        this.name=name;
        this.basePay=basePay;
    }
    
    public int get_partnerId()
    {
        return this.partnerId;
    }
    
    public void set_partnerId()
    { 
        this.partnerId=partnerId;
    }
    
    public String get_name()
    {
        return this.name;
    }
    
    public void set_name()
    {
        this.name=name;
    }
    
    public int get_basePay()
    {
        return this.basePay;
    }
    
    public void set_basePay()
    {
        this.basePay=basePay;
    }
    @Override
    public String toString()
    {
        return "Details--> Id= "+get_partnerId()+" Name= "+get_name()+" Base pay ="+get_basePay();
    }
    
    public double calculatePayment()
    {
        return basePay;
    }
}