package week10.WORKSHOP10;


/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class person
{
    private int id;
    private String name;
    public person(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
    public int get_id()
    {
        return this.id;
    }
    
    public void set_id()
    {
        this.id=id;
    }
    
    public String get_name()
    {
        return this.name;
    }
    
    public void set_name()
    {
        this.name=name;
    }
    
    public double calculateSalary()
    {
        return 10000;
    }
    @Override
    public String toString()
    {
        return "details--> id :" +get_id() +"name :"+get_name();
    }
}