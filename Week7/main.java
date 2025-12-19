package Week7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        Student s1= new Student();
        s1.collegeID= "np014sp10";
        s1.name="Aabash";
        s1.age=19;
        s1.study();
        
        System.out.println(s1.collegeID);
        System.out.println(s1.name);
        System.out.println(s1.age);
        
        Student s2=new Student();
        s2.collegeID="00001";
        s2.name="YOYOYO";
        s2.age=99;
        s2.laugh();
        
        System.out.println(s2.collegeID);
        System.out.println(s2.name);
        System.out.println(s2.age);
        
        Car c1= new Car();
        c1.brand="Audi";
        c1.color="black";
        c1.price=995000;
        c1.model="A4";
        c1.drive();
        
        System.out.println(c1.brand);
        System.out.println(c1.color);
        System.out.println(c1.model);
        System.out.println(c1.price);
        
        Car c2=new Car();
        c2.brand="Mercedes";
        c2.color="black";
        c2.price=1995000;
        c2.model="M5";
        c2.brake();
        
        System.out.println(c2.brand);
        System.out.println(c2.color);
        System.out.println(c2.model);
        System.out.println(c2.price);
    }
}