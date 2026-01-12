package week10.WORKSHOP10;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main(String[] args)
    {
        Doctor d1 = new Doctor(001,"Aabash","Psychology",1000);
        System.out.println(d1);
        double d_salary=d1.calculateSalary();
        System.out.println("The salary of the doctor is "+d_salary);
        Nurse n1= new Nurse(002,"Prajwal","Night",2500);
        double n_salary=d1.calculateSalary();
        System.out.println("The salary of the nurse is "+n_salary);
        System.out.println(n1);
    }
}