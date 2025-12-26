package Week7.WORKSHOP.SCENARIO;
import java.util.Scanner;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int AccountNumber;
    String name;
    int balance;
    Scanner sc=new Scanner(System.in);
    
    public BankAccount(int AccountNumber, String name, int balance)
    {
        this.AccountNumber = AccountNumber;
        this.name = name;
        this.balance = balance;
    }

    void depositMoney()
    {
        System.out.println("Enter the amount you want to deposit: ");
        int deposit = sc.nextInt();
        balance = balance + deposit;
    }

    void withdrawMoney()
    {
        System.out.println("Enter the amount you want to withdraw: ");
        int withdraw = sc.nextInt();
        if(withdraw>balance)
        {
            System.out.println("Withdraw amount eceeds the balance in the account.");
        }
        else
        {
            balance = balance - withdraw;
        }
    }

    void currentBalance()
    {
        System.out.println(balance);
    }


}