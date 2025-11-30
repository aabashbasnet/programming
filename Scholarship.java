import java.util.Scanner;

/**
 * Write a description of class Scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scholarship
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your GPA");
    float GPA= sc.nextFloat();
    System.out.println("Enter your attendence %");
    int attendence= sc.nextInt();
    System.out.println("Enter your attitude score(1-10)");
    int attitude=sc.nextInt();
    if(GPA>=3.2)
    {
     if(attendence>80)
     {
      if(attitude<5)
      {
    
       System.out.println("Eligible for scholarship");
      }
      else 
      {
      System.out.println("not eligible for scholarship because altitude is greater than 5");
      }
      }
    else {

       System.out.println("not eligible for scholarship because attendence is less than 80%");
     }}

else {
    
System.out.println("not eligible for scholarship because GPA is less than 3.2");
}
}
}