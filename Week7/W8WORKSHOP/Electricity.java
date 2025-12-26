package Week7.W8WORKSHOP;


/**
 * Write a description of class Electricity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Electricity
{
    public static void main(String[] args)
    {
        ElectricityBill e1=new ElectricityBill("Aabash",150);
        double bill=e1.calculateBill();
        System.out.println("Your bill is "+bill);
    }
}