package week9.workshop;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private int numberOfDoors;
    private String fuelType;
    
    public Car(int numberOfDoors,String fuelType,int vehicleID,String brand,double BasePrice)
    {
         super(vehicleID,brand,BasePrice);
        this.numberOfDoors=numberOfDoors;
        this.fuelType=fuelType;
       
    }
        
        double calculateFinalPrice()
        {
            double finalprice=BasePrice+calculateTax();
            return(finalprice*0.05+finalprice);
        }
        
        
    }
    
