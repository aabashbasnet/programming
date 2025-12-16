import java.util.Scanner;

/**
 * Write a description of class SmallMarks2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SmallMarks2D
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] marks={{70,90},{80,90}};
        System.out.println("\tEnglish Nepali");
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(i+1+"\t");
            for(int j=0;j<marks[i].length;j++)
            {
                
                System.out.print(marks[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}