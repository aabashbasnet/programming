package week10.WORKSHOP10;


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
        SavingsAccount s1 = new SavingsAccount(1,"Aabash",20000);
        System.out.println(s1);
        System.out.println(s1.calculateInterest(8));
        
        CurrentAccount c1 = new CurrentAccount(2,"Prajwal",2000);
        System.out.println(c1);
        System.out.println(c1.calculateInterest(9));
    }
}