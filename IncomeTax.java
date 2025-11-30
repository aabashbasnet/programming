import java.util.Scanner;

/**
 * Write a description of class IncomeTax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IncomeTax
{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your annual income in NRP");
    int income= sc.nextInt();
    double taxed;
    if( income>0 && income<=500000)
        {
            taxed=income*0.01;
            System.out.println("Your payable tax is :"+taxed);
        }
    else if(income>500000 && income<=700000)
        {
            taxed=5000+0.1*(income-50000);
            System.out.println("Your payable tax is :"+taxed);
        }
    else if(income>700000 && income<=1000000)
        {
            taxed=15000+0.2*(income-700000);
            System.out.println("Your payable tax is :"+taxed);
        }
    else if(income>1000000 && income<=2000000)
        {
            taxed=35000+0.3*(income-1000000);
            System.out.println("Your payable tax is :"+taxed);
        }
    else if(income>2000000 && income<=5000000)
        {
            taxed=335000+0.36*(income-2000000);
            System.out.println("Your payable tax is :"+taxed);
        }
    else if(income>5000000)
        {
            taxed=1135000+0.39*(income-5000000);
            System.out.println("Your payable tax is :"+taxed);
        }
}
}