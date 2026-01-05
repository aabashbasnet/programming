package week9.workshop;


/**
 * Write a description of class Mainfor4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mainfor4
{
    public static void main(String[] args)
    {
        Teacher t1=new Teacher(001,10000,"Islington","Programming",5000);
        double annual_salary=t1.calculateAnnualSalary();
        System.out.println("The annual salary of the teacher is "+annual_salary);
        Staff s1=new Staff();
        double staff_salary=s1.calculateSalary();
        System.out.println("The salary of the staff is "+staff_salary);
        Person p1= new Person(001,15000,"BKVM");
        p1.getcollegeName();
    }
}