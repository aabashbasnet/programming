package week10.WORKSHOP10;


/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends Account
{
    public SavingsAccount(int accountNo,String holderName,int balance)
    {
        super(accountNo,holderName,balance);
    }
    
    @Override
    public double calculateInterest()
    {
        return 10;
    }
    
    @Override
    public double calculateInterest(double rate)
    {
        return ((this.get_balance()*this.calculateInterest()*10*rate)/1000);
    }
}