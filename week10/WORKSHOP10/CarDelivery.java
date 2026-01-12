package week10.WORKSHOP10;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends DeliveryPartner
{
    public CarDelivery(int partnerId,String name,int basePay)
    {
        super(partnerId,name,basePay);
    }
    
    @Override
    public double calculatePayment()
    {
        return super.calculatePayment()+5000;
    }
    
    public double calculatePayment(int extraOrders)
    {
        return this.calculatePayment()+extraOrders* 100;
    }
    @Override
    public String toString()
    {
        return super.toString();
    }
}