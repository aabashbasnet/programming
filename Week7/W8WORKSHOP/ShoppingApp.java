package Week7.W8WORKSHOP;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{
    public static void main(String[] args)
    {
        ShoppingCart s1=new ShoppingCart("Mouse",5000,5);
        s1.calculateTotal();
        s1.calculateDiscountedTotal(80);
        s1.displayCart();
        double total=s1.calculateTotal();
        System.out.println("The total price is "+total);
        double totalprice=s1.calculateDiscountedTotal(80);
        System.out.println("The total price after discount is"+totalprice);
        
    }
}