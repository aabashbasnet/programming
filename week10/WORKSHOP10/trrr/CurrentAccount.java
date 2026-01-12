package week10.WORKSHOP10.trrr;


public class CurrentAccount extends BankAccount
{
   public CurrentAccount(long accountNumber, String holderName, double balance)
   {
        super(accountNumber,  holderName, balance);
   }
   
   @Override
   protected double getInterest()
    {
        return 5.0;
    }
    
}
