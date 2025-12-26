package Week7.WORKSHOP;


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
       Book b1=new Book();
       b1.title="Physics";
       b1.author="Prajwal";
       b1.price=200;
       System.out.println("b1.title");
       System.out.println("b1.author");
       System.out.println("b1.price");
       
       Book b2=new Book();
       b2.title="Depression";
       b2.author="Ashimesh";
       b2.price=999;
        System.out.println("b2.title");
        System.out.println("b2.author");
        System.out.println("b2.price");
        
        Rectangle r1=new Rectangle();
        r1.length=10;
        r1.breadth=20;
        r1.area();
        
        Rectangle r2=new Rectangle();
        r2.length=9;
        r2.breadth=19;
        r2.area();
        
        Employee e1= new Employee();
        e1.id="001";
        e1.name="Aabash";
        e1.salary=30000;
        e1.details();
        
        Employee e2=new Employee();
        e2.id="002";
        e2.name="Bardan";
        e2.salary=20000;
        e2.details();
        
        Employee e3=new Employee();
        e3.id="003";
        e3.name="Prajwal";
        e3.salary=10000;
        e3.details();
        
        if(e1.salary>e2.salary && e1.salary>e3.salary)
        {
            System.out.println("The employee with the highest salary");
            e1.details();
        }
        else if(e2.salary>e3.salary && e2.salary>e1.salary)
        {
            System.out.println("The employee with the highest salary");
            e2.details();
        }
        else
        {
            System.out.println("The employee with the highest salary");
            e3.details();
        }
        
        Laptop l1=new Laptop("mac",8,320000);
        l1.CheckRAM();
        Laptop l2=new Laptop("dell",16,250000);
        l2.CheckRAM();
        Laptop l3=new Laptop("acer",16,150000);
        l3.CheckRAM();
        
        Mobile m1=new Mobile("apple",20000);
        m1.isAffordable();
        Mobile m2=new Mobile("orange",400000);
        m2.isAffordable();
        Mobile m3=new Mobile("pushpa",10000);
        m3.isAffordable();
        
        Result re1=new Result(99,98,97);
        re1.calculator();
        Result re2=new Result(99,98,97);
        re2.calculator();
        Result re3=new Result(99,98,97);
        re3.calculator();
        
        
    }
}