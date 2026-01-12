package week10.WORKSHOP10;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int rollNo;
    private String name;
    private float marks;
    
    public Student(int rollNo,String name,int marks)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    
    public int get_rollNo()
    {
        return this.rollNo;
    }
    
    public void set_rollNo()
    {
        this.rollNo=rollNo;
    }
    
    public String get_name()
    {
        return this.name;
    }
    
    public void set_name()
    {
        this.name=name;
    }
    
    public float get_marks()
    {
        return this.marks;
    }
    
    public void set_marks()
    {
        this.marks=marks;
    }
    
    @Override
    public String toString()
    {
        return "Roll no: "+get_rollNo()+" Name "+get_name()+" marks: "+get_marks();
    }
    
    public String calculateResult()
    {
        if(marks>=40)
        {
            return "pass";
        }
        else
        {
            return "fail";
        }
    }
    public String calculateResult(int graceMarks)
    {
        if(marks+graceMarks>=40)
        {
            return "pass";
        }
        else
        {
            return "fail";
        }
    }
}