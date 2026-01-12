package week10;


/**
 * Write a description of class Onllinecourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Onllinecourse extends Course
{
    private double platformFee;
    
    public Onllinecourse(int courseId,String courseName,double baseFee,double platformFee)
    {
        super(courseId,courseName,baseFee);
        this.platformFee=platformFee;
    }
    
    public double getPlatformFee()
    {
        return this.platformFee;
    }
    
    public void setPlatformFee()
    {
        this.platformFee=platformFee;
    }
    
    @Override
    public double calculateFee()
    {
        return super.getBaseFee()+platformFee;
    }
    
    public void displayOnllineCourseDetails()
    {
        super.displayCourse();
        System.out.println("Fee for online course is :"+this.platformFee);
    }
}