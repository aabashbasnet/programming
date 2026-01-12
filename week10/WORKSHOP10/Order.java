package week10.WORKSHOP10;


/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    private int orderId;
    private String customerName;
    private int amount;
    
    public Order(int orderId,String customerName,int amount)
    {
        this.orderId=orderId;
        this.customerName=customerName;
        this.amount=amount;
    }
    
    public int get_orderId()
    {
        return this.orderId;
    }
    
    public void set_orderId()
    {
        this.orderId=orderId;
    }
    
    public String get_customerName()
    {
        return this.customerName;
    }
    
    public void set_customerName()
    {
        this.customerName=customerName;
    }
    
    public int get_amount()
    {
        return this.amount;
    }
    
    public void set_amount()
    {
        this.amount=amount;
    }
    
    @Override
    public String toString()
    {
        return "ID :"+get_orderId()+" Name :"+get_customerName()+" Amount :"+get_amount();
    }
    
    public double calculateFinalAmount()
    {
        return amount;
    }
    
    public double calculateFinalAmount(double discountAmount)
    {
        return amount-discountAmount;
    }
}