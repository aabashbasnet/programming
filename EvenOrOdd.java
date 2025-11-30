import java.util.Scanner;
/**
 * Write a description of class EvenOrOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOrOdd
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = sc.nextInt();
    if(number>0){
    System.out.println("Positive");}
    else if(number==0){
    System.out.println("Zero");}
    else{
    System.out.println("Negative");}
    
    }
}