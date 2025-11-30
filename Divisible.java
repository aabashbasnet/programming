import java.util.Scanner;

/**
 * Write a description of class Divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divisible
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int number= sc.nextInt();
    if(number%3==0 && number%5==0){
    System.out.println("Divisible by both 3 and 5");}
    else{
    System.out.println("Not divisible by both 3 and 5");} 
    }
}