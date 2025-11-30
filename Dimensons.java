import java.util.Scanner;

/**
 * Write a description of class Dimensons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dimensons
{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter you paper size (A0-A5)");
    String paper= sc.nextLine();
     switch (paper)
     {
        case "A0":
            System.out.println("A0: 841 x 1189 mm(33.1 x46.8 inches)");
            break;
        case "A1":
            System.out.println("A1: 594 x841 mm(23.4 x33.1 inches)");
            break;
        case "A2":
            System.out.println("A2: 420 x 594 mm(16.5 x 23.4 inches)");
            break;
        case "A3":
             System.out.println("A3: 297 x 420 mm(11.7 x 16.5 inches)");
            break;
        case "A4":
            System.out.println("A4: 210 x 297 mm(8.3 x 11.7 inches)");
            break;
        case "A5":
            System.out.println("148 x 210mm(5.8 x 8.3 inches)");
            break;
        default:
            System.out.println("Invali input use range (A0 TO A5)");
                        
     }
    
    }
}