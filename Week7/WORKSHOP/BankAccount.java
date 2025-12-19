package Week7.WORKSHOP;
import java.util.Scanner;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int AccNum;
    String name;
    int balance;
    Scanner sc=new Scanner(System.in);
    
    public BankAccount(int AccNum,String name,int balance)
    {
        this.AccNum=AccNum;
        this.name=name;
        this.balance=balance;
    }
    
    void deposit()
    {
        System.out.println("Enter the amount you want to deposit");
        int deposit=sc.nextInt();
        balance=balance+deposit;
    }
    
    void withdraw()
    {
        System.out.println("Enter the amount you want to withdraw");
        int withdraw=sc.nextInt();
        if(withdraw>balance)
        {
            System.out.println("You do not have sufficient fund in the account");
        }
        else
        {
            balance=balance-withdraw;
        }
        
    }
    
    void display()
    {
        System.out.println(balance);
        
    }
}