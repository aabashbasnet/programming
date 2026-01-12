package week10.WORKSHOP10;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends DeliveryPartner
{
    public BikeDelivery(int partnerId,String name,int basePay)
    {
        super(partnerId,name,basePay);
    }
    
    @Override
    public double calculatePayment()
    {
        return super.calculatePayment()+2000;
    }
    
    public double calculatePayment(int extraOrders)
    {
        return this.calculatePayment()+extraOrders* 60;
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}