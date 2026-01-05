package week9.workshop;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{
    private int engineCapacity;
    public Bike(int vehicleID,String brand,double BasePrice,int engineCapacity)
    {
        super(vehicleID,brand,BasePrice);
        this.engineCapacity=engineCapacity;
    }
    
    double calculateFinalPrice()
    {
        return(BasePrice+calculateTax());
    }
    
    
}