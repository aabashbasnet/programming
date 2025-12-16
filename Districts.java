import java.util.Scanner;

/**
 * Write a description of class Districts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Districts
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] district={"Morang","Kathmandu","Bhaktapur","Lalitpur"};
        for(int i=0;i<district.length;i++)
        {
            System.out.println(i+". "+district[i]);
        }
        System.out.println("Enter how many districts you want to print");
        int number= sc.nextInt();
        
        for(int i=0;i<number;i++)
        {
            System.out.println(i+". "+district[i]);
        }
    }
}