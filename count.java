import java.util.Scanner;

/**
 * Write a description of class count here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class count
{
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num=sc.nextInt();
        int reverse=0;
        int count=0;
        int c=0;
        while(num>0)
        {
           int a=num%10;
           c=c+a;
          reverse=reverse*10+a;
          
           num=num/10;
           count++;
        }
        System.out.println(c);
        System.out.println(reverse);
        System.out.println(count);
    }
}