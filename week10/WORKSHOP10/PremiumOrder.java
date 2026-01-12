package week10.WORKSHOP10;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends Order
{
    public PremiumOrder(int orderId,String customerName,int amount) 
   {
    super(orderId,customerName,amount);
   }
   
   @Override
   public double calculateFinalAmount()
    {
        return super.calculateFinalAmount();
    }
    
    @Override
    public double calculateFinalAmount(double discountAmount)
    {
        return super.calculateFinalAmount(discountAmount);
    }
}