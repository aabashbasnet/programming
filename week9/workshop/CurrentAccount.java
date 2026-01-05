package week9.workshop;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount
{
    private double overdraftLimit;
    
    public CurrentAccount(int accountNumber,String accountholderName,double balance,double overdraftLimit)
    {
        super(accountNumber,accountholderName,balance);
        this.overdraftLimit=overdraftLimit;
    }
    
    boolean withdraw(double amount)
    {
        if(amount<=balance+overdraftLimit)
        {
            balance=balance-amount;
            return true;
        }
        else
        {
            return false;
        }
    }
    
}