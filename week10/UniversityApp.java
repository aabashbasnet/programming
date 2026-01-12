package week10;


/**
 * Write a description of class UniversityApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UniversityApp
{
    public static void main(String[] args)
    {
        Course c1= new Course(001,"Programming",15000);
        double fee=c1.calculateFee();
        System.out.println("The fee of this course is "+fee);
        double discountedfee=c1.calculateFee(10000);
        System.out.println("The fee after discount is "+discountedfee);
        Onllinecourse oc1 = new Onllinecourse(002,"Computing",12000,5000);
        Offlinecourse ofc1= new Offlinecourse(003,"Hardware",10000,8000);
    }
}
