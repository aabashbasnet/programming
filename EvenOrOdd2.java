import java.util.Scanner;

/**
 * Write a description of class EvenOrOdd2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOrOdd2
{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number");
    int number= sc.nextInt();
    if(number%2==0){
    System.out.println("Even");}
    else{
    System.out.println("Odd");}
    
    }
}