package week10.WORKSHOP10;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp
{
    public static void main(String[] args)
    {
        NormalOrder n1= new NormalOrder(1,"Aabash",700);
        double amount=n1.calculateFinalAmount();
        System.out.println("The final bill amount is "+amount);
        double discountAmount=n1.calculateFinalAmount(700);
        System.out.println("The final bill amount after discount is "+discountAmount);
        PremiumOrder p1= new PremiumOrder(2,"Basnet",12000);
        amount=p1.calculateFinalAmount();
        System.out.println("The final bill amount is "+amount);
        discountAmount=p1.calculateFinalAmount(700);
        System.out.println("The final bill amount after discount is "+discountAmount);
    }
}