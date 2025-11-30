import java.util.Scanner;

/**
 * Write a description of class Workshop04 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATM
{
    public static void main(String[] args)
    {
        /*
         * Since we are going to make ATM related process application,
         * we need to use both if else and switch statement 
         */
        
        Scanner scan= new Scanner(System.in);
        
        // since we have our fixed pin and balance in our account, 
        // we can set that pin and balance
        
        int savedPin= 1234;
        double balance= 6000;
        
      
        
        System.out.println("Enter your pin.");
        
        int pin = scan.nextInt();
        
        // check if your pin is correct.
        
        if(pin != savedPin)  
        {
            System.out.println("Incorrect pin! Access Denied");
        }
        else
        {
        System.out.println("Login Successful!");
        
        
        System.out.println("\n1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        
        
        int choice = scan.nextInt();
        
        
        switch(choice){
        
            case 1:
                {
                    System.out.println("Your balance is: "+ balance);
                    break;
                }
                
            case 2: {
                
                System.out.println("Enter your withdrawl amount.");
                double withdraw= scan.nextDouble();
                
                if(withdraw <= 0)
                {
                    System.out.println("Invalid balance");
                }
                else if(withdraw > balance){
                    System.out.println("Insufficent balance to withdraw.");
                }
                
                else
                {
                    balance -= withdraw;
                    System.out.println("Withdrawl successful: "+ withdraw);
                    System.out.println("The remaining balance is: "+ balance);
                }
                
                break;
                
            }   
            
            
            case 3:{
                System.out.println("Enter the amount you want to deposit.");
                
                double deposit= scan.nextDouble();
                
                if(deposit <=0 )
                {
                    System.out.println("Invalid balance to deposit.");
                }
                else
                {
                    balance += deposit;
                    System.out.println("Your deposited amount is: "+ deposit);
                    System.out.println("Your total balance is: "+ balance);
                }
                break;   
            }
            
            case 4: System.out.println("Thank you for using an ATM! Goodbye"); break;
            
            default: System.out.println("Invalid option.");
        }   
        }
    }
        
        
        
    
}