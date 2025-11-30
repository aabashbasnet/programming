import java.util.Scanner;

/**
 * Write a description of class GpaToGrade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GpaToGrade
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your GPA in decimal point");
    float GPA=sc.nextFloat();
    if (GPA>=0.0 && GPA<=4.0){
    {
if (GPA<4.0 && GPA>3.6){
    System.out.println("A+");}
    else if(GPA<3.6 && GPA>3.2){
    System.out.println("A");}
    else if(GPA<3.2 && GPA>2.8){
    System.out.println("B+");}
    else if(GPA<2.8 && GPA >2.4){
    System.out.println("B");}
    else if(GPA<2.4 && GPA>2.0){
    System.out.println("C+");}
    else if(GPA<2.0 && GPA>1.6){
    System.out.println("C");}
    else if(GPA<1.6 && GPA>0.0){
    System.out.println("Fail");}
}
}
    else
    {
    System.out.println("Invalid GPA");}
    
    
    }
}