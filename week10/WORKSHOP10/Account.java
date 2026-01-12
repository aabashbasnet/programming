package week10.WORKSHOP10;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    private int accountNo;
    private String holderName;
    private int balance;
    
    public Account(int accountNo,String holderName,int balance)
    {
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }
    
    public int get_accountNo()
    {
        return this.accountNo;
    }
    
    public void set_accountNo()
    {
        this.accountNo=accountNo;
    }
    
    public String get_holderName()
    {
        return this.holderName;
    }
    
    public void set_holderName()
    {
        this.holderName=holderName;
    }
    
    public int get_balance()
    {
        return this.balance;
    }
    
    public void set_balance()
    {
        this.balance=balance;
    }
    
    @Override
    public String toString()
    {
        return "Account no: "+get_accountNo()+ " Holder name: "+get_holderName()+" balance: "+get_balance();
    }
    
    public double calculateInterest()
    {
        return 8;
    }
    
    public double calculateInterest(double rate)
    {
        return (this.get_balance()*this.calculateInterest()*10*rate);
    }
}