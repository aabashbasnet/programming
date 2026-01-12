package week10.WORKSHOP10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main(String[] args)
    {
        BikeDelivery b1= new BikeDelivery(001,"Aabash",12000);
        System.out.println(b1);
        double b_payment=b1.calculatePayment();
        System.out.println("The payment of the bike delivery person is "+b_payment);
        double b_extraorder=b1.calculatePayment(80);
        System.out.println("The payment of the bike delivery person is "+b_extraorder);
        CarDelivery c1 = new CarDelivery(002,"Prajwal",20000);
        System.out.println(c1);
        double c_payment=c1.calculatePayment();
        System.out.println("The payment of the car delivery person is "+c_payment);
        double c_extraorder=c1.calculatePayment(80);
        System.out.println("The payment of the car delivery person is "+c_extraorder);
        
    }
}