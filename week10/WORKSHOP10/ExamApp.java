package week10.WORKSHOP10;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp
{
    public static void main(String[] args)
    {
        ScienceStudent s1 = new ScienceStudent(1,"Aabash",89);
        System.out.println(s1);
        System.out.println(s1.calculateResult());
        System.out.println(s1.calculateResult(10));
        ManagementStudent m1= new ManagementStudent(2,"Sambriddhi",35);
        System.out.println(m1);
        System.out.println(m1.calculateResult());
        System.out.println(s1.calculateResult(5));
        
    }
}