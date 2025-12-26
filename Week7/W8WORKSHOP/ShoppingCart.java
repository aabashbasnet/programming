package Week7.W8WORKSHOP;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private String itemName;
    private double itemPrice;
    private int quantity;

    
    public ShoppingCart(String itemName,double itemPrice,int quantity)
    {
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.quantity=quantity;
    }
    double getQuantity()
    {
        return this.quantity;
    }
    
    void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    
    double calculateTotal()
    {
        double total=itemPrice*quantity;
        return total;
    }
    
    double calculateDiscountedTotal(double discountPercent)
    {
         double total= calculateTotal();
         double totalprice=total*((100-discountPercent)/100);
         return totalprice;
    }
    
    void displayCart()
    {
        System.out.println("The name of the item is "+this.itemName);
        System.out.println("The price of the item is "+this.itemPrice);
        System.out.println("The quantity of the item is "+this.quantity);
        
    }
}