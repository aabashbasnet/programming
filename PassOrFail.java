import java.util.Scanner;
/**
 * Write a description of class PassOrFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassOrFail
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
    if(marks>=40){
    System.out.println("Pass");}
    else
    {
    System.out.println("Fail");}
    
    }
}