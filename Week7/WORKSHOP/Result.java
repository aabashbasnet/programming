package Week7.WORKSHOP;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    int subject1;
    int subject2;
    int subject3;
    
    public Result(int subject1,int subject2,int subject3)
    {
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    void calculator()
    {
        int total=subject1+subject2+subject3;
        double percentage=(subject1+subject2+subject3)/3;
        System.out.println("The total marks obtained is "+total);
        System.out.println("The percentage obtained is "+percentage);
    }
}