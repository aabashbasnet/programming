package week9;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{
    private boolean hasGears;
    
    public Bike(String brandName,int maxSpeed,boolean hasGears)
    {
        super(brandName,maxSpeed);
        this.hasGears=hasGears;
    }
        
        public void displayBikeDetails()
        {
            System.out.println("Bike brand Name: "+super.brandName); 
        
            System.out.println("Bike max speed: "+super.maxSpeed);
            System.out.println("Has gear or not: "+this.hasGears);
        }
    }
