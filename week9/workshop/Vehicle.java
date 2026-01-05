package week9.workshop;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    protected int vehicleID;
    protected String brand;
    protected double BasePrice;
    
    public Vehicle(int vehicleID,String brand,double BasePrice)
    {
        this.vehicleID=vehicleID;
        this.brand=brand;
        this.BasePrice=BasePrice;
    }
    
    void displayVehicleInfo()
    {
        System.out.println("The ID of this vehicle is :"+vehicleID);
        System.out.println("The brand of this vehicle is :"+brand);
        System.out.println("The base price of this vehicle is :"+BasePrice);
    }
    
    double calculateTax()
    {
        double tax=0.1*BasePrice;
        return(tax); 
    }
}