import java.util.Scanner;

/**
 * Write a description of class SellingPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPrice
{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the marked price of the item");
    float mp=sc.nextFloat();
    System.out.println("input category either A,B,C OR D");
    char category= sc.next().charAt(0);
    if(category=='A'){
    float sp=mp-(mp*0.6f);
    System.out.println("Selling Price is :"+sp);
}
 else if(category=='B'){
    float sp=mp-(mp*0.4f);
    System.out.println("Selling Price is :"+sp);
}
else if(category=='C'){
float sp=mp-(mp*0.2f);
System.out.println("Selling Price is :"+sp);}
else if(category=='D'){
float sp=mp-(mp*0.1f);
System.out.println("Selling Price is :"+sp);}
else{
System.out.println("Invadlid Input ,use either A,B,C or D");}
    
    
}
}