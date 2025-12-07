import java.util.Scanner;

/**
 * Write a description of class FixedDepostiNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepostiNIB
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int choice=1;
        while(choice==1)
        {
        System.out.println("Enter the amount you want to keep in Fixed Deposit");
        double P= sc.nextInt();
        System.out.println("Enter the annual rate");
        double AnnualRate = sc.nextDouble();
        if(P<1000)
            {
                System.out.println("Minimum deposition amount is Rs 1000,Rs "+P+" is too low");
                break;
            }
        double rate = AnnualRate/100;
        System.out.println("Enter the time in years");
        double years= sc.nextDouble();
        if(years>5)
            {
                System.out.println("Maximum duration is 5 years");
                break;
            }
        int n=12;
        
        double Amount=P*Math.pow(1+(rate/n),n*years);
        double Fee = P*0.005;
        double FinalAmount = Amount-Fee;
        System.out.println("Your total amount is "+FinalAmount);
        System.out.println("Do you want to continue? Say 1 to continue");
        choice= sc.nextInt();
        }
        
    }
}