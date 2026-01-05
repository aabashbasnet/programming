package week9.workshop;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args)
    {
        SavingsAccount sa1= new SavingsAccount(001,"Aabash",50000,7);
        sa1.deposit(5000);
        
        CurrentAccount ca1=new CurrentAccount(002,"Aabash2",30000,10000);
        ca1.withdraw(1000);
        System.out.println("The current balance is "+ca1.balance);
        
    }
    
}