import java.util.Scanner;

/**
 * Write a description of class b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class b
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int factorial=1;
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}