
/**
 * Write a description of class sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sum
{
    public static void main(String[] args)
    {
        int number=1;
        int sum=0;
        
        do
        {
            int square=number*number;
            number++;
            sum=sum+square;
        }while(number<=10);
        System.out.println(sum);
    }
}