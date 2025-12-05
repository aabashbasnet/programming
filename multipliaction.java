import java.util.Scanner;

/**
 * Write a description of class multipliaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class multipliaction
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int a=num*i;
            System.out.println(a);
        }
    }
}