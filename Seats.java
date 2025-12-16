import java.util.Scanner;

/**
 * Write a description of class Seats here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Seats
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[][] seats=new String[2][3];
        seats[0][0]="Aabash";
        seats[0][1]="Bardan";
        seats[0][2]="Ashimesh";
        
        for(int i=0;i<seats.length;i++)
        {
            for(int j=0;j<seats[i].length;j++)
            {
                if(seats[i][j]==null)
                {
                    System.out.print("empty\t");
                }
                else
                {
                System.out.print(seats[i][j]+"\t");
                }
            
        }
        System.out.println();
    }
}
}