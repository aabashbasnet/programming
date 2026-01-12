package week10.WORKSHOP10;


/**
 * Write a description of class ScienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStudent extends Student
{
    public ScienceStudent(int rollNo,String name,int marks)
    {
        super(rollNo,name,marks);
    }
    
    @Override
    public String calculateResult()
    {
        if(get_marks()>=45)
        {
            return "pass";
        }
        else
        {
            return "fail";
        }
    }
    
    @Override
    public String calculateResult(int graceMarks)
    {
        if(get_marks()+graceMarks>=45)
        {
            return "pass";
        }
        else
        {
            return "fail";
        }
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}