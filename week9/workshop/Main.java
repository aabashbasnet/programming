package week9.workshop;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Car c1=new Car(4,"Petrol",01,"Audi",2000000);
        double tax=c1.calculateTax();
        double finalprice=c1.calculateFinalPrice();
        c1.displayVehicleInfo();
        System.out.println("The total tax on this vehicle is "+tax);
        System.out.println("The final price of this vehicle is "+finalprice);
        Bike b1=new Bike(001,"Triumph",714000,13);
        double tax2=b1.calculateTax();
        double finalprice2=b1.calculateFinalPrice();
        b1.displayVehicleInfo();
        System.out.println("The total tax on this vehicle is "+tax2);
        System.out.println("The final price of this vehicle is "+finalprice2);
    }
}