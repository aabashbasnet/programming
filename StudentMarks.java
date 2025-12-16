import java.util.Scanner;

/**
 * Write a description of class StudentMarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentMarks
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     int[] values={10,20,30,40,50};
     for(int i=0;i<values.length;i++)
     {
         System.out.println("Value at index : "+i);
         System.out.println(values[i]);
     }
     int sum=0;
     for(int i=0;i<values.length;i++)
     {
         sum=sum+values[i];
     }
     double avg=sum/values.length;
     System.out.println("The sum of the "+values.length+" numbers is"+sum);
     System.out.println("The average of the "+values.length+" numbers is"+avg);
     int max=0;
     int min=values[1];
     for(int i=0;i<values.length;i++)
     {
        if(values[i]>max)
        {
            max=values[i];
        }
        if(values[i]<min)
        {
            min=values[i];
        }
     }
     System.out.println("The highest number is "+max);
     System.out.println("The lowest number is "+min);
     System.out.println("Enter how many scores you want to enter");
     int number=sc.nextInt();
     int[] array=new int[number];
     for(int i=0;i<array.length;i++)
     {
       System.out.println("Value at index "+i);
       array[i]=sc.nextInt();
     }
     for(int i=0;i<array.length;i++)
     {
       System.out.println("Value at index "+i);
       System.out.println(array[i]);
     }
     
   }
}