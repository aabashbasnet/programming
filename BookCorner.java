
/**
 * Write a description of class BookCorner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookCorner
{
    public static void main(String[] args)
    {
    String[] categories={"Fiction","Nepali"};
    String[][] titles=new String[2][1];
    titles[0][0]="Kagbeni";
    titles[1][0]="Kabaddi";
    double[][] prices=new double[2][1];
    prices[0][0]=400;
    prices[1][0]=650;
    System.out.print(categories[0]+"\t");
    System.out.println(categories[1]);
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<1;j++)
        {
            System.out.print(titles[i][j]+"\t");
        }
    }
    System.out.println();
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<1;j++)
        {
            System.out.print(prices[i][j]+"\t");
        }
    }
    System.out.println();
    }
}