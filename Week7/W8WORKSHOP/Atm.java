package Week7.W8WORKSHOP;


/**
 * Write a description of class Atm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Atm
{
    public static void main(String[] args)
    {
        BankAccount b1=new BankAccount(001,1000,"Aabash");
        b1.deposit();
        b1.withdraw();
        double balance=b1.getBalance();
        System.out.println(balance);
    }
}