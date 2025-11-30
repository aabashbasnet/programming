import java.util.Scanner;
/**
 * Write a description of class workshop3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop3
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
    String check = (num>=40)?"Pass":"Fail";
    System.out.println(check);
}
}