import java.util.Scanner;

/**
 * Write a description of class Assignment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RiskhawFare
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
       
        //Inputs
        System.out.println("Total distance travelled; ");
        float distance = input.nextFloat();
        System.out.println("Total time consumed: ");
        float time= input.nextFloat();
        System.out.println("Are you local?(true/false)");
        boolean localCheck = input.nextBoolean();
        System.out.println("Night ride?(true/false)");
        boolean nightORday = input.nextBoolean();
       
        //Rate decleration
       
        float baseFare = 45;
        float distanceFare = distance * 4.5f;
        float timeFare = time * 2.5f;
        float totalFare = baseFare + distanceFare + timeFare;
       
        //Conditions
       
        totalFare = (localCheck) ? totalFare * 1.04f : totalFare;
        totalFare = (nightORday) ? totalFare * 1.44f : totalFare;
       
        //Final Fare Total
         System.out.println("Total Fare: Nrs "+ totalFare);
        }
}