import java.util.Scanner;

/**
 * Write a description of class SellingPriceSwtich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPriceSwtich
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marked price of the item");
    float mp=sc.nextFloat();
    System.out.println("Enter the category A,B,C OR D");
    char category=sc.next().charAt(0);
    switch(category){
    case 'A':
        float sp=mp-(mp*0.6f);
        break;
        case 'B':
             sp=mp-(mp*0.4f);
             System.out.println("Selling price is :"+sp);
             break;
             case 'C':
                 sp=mp-(mp*0.2f);
                 System.out.println("Selling price is :"+sp);
                 break;
                 case 'D':
                     sp=mp-(mp*0.1f);
                     System.out.println("Selling price is :"+sp);
                     break;
                     default:System.out.println("Invalid input, use either A,B,C OR D");
                     break;
                         
                 
            
            
    
    }
    
    
}
}