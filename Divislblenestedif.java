import java.util.Scanner;

/**
 * Write a description of class Divislblenestedif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divislblenestedif
{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int number= sc.nextInt();
    if(number%3==0){
        if(number%5==0){
        System.out.println("divisible by both 3 and 5");}
        else{
        System.out.println("Not divisible by 5");}
        
        
    }else if(number%5==0){
    
    System.out.println("Divisible by 5 only");}
    else{
System.out.println("not divisible by 3 and 5");}
}
}

