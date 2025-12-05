import java.util.Scanner;

/**
 * Write a description of class calculate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculate
{
    public static void main(String[] args)
    {
        char choice='y';
        Scanner sc=new Scanner(System.in);
        int calculation=0;
        while(choice=='y' || choice=='Y')
        {
            System.out.println("Enter the two numbers to want to perform calculation on");
            System.out.println("Enter the greater number");
            int a=sc.nextInt();
            System.out.println("Enter the lower number");
            int b=sc.nextInt();
            System.out.println("Enter +, -,* or/");
            char c=sc.next().charAt(0);
            switch(c)
            {
            case '+':
                {
                    calculation=a+b;
                    System.out.println("The sum of the two numbers is "+calculation);
                    break;
                }
            case '-':
                {
                    calculation=a-b;
                    System.out.println("The difference of the two numbers is "+calculation);
                    break;
                }
            case '*':
                {
                    calculation=a*b;
                    System.out.println("The multiplication of the two numbers is "+calculation);
                    break;
                }
            case '/':
                {
                    calculation=a/b;
                    System.out.println("The division of the two numbers is "+calculation);
                    break;
                }
            default:
                {
                    System.out.println("Invalid choice");
                    break;
                }
            }
            System.out.println("Enter yes to continue or anything else to exit");
            choice=sc.next().charAt(0);
    }
}
}