package week10;


/**
 * Write a description of class Offlinecourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Offlinecourse extends Course
{
    private double labFee;
    public Offlinecourse(int courseId,String courseName,double baseFee,double labFee)
    {
        super(courseId,courseName,baseFee);
        this.labFee=labFee;
    }
    
    public double getLabFee()
    {
        return this.labFee;
    }
    
    public void setLabFee()
    {
        this.labFee=labFee;
    }
    
    @Override
    public double calculateFee()
    {
        return super.getBaseFee()+this.labFee;
    }
    
    public void displayOfflineCourseDetails()
    {
        super.displayCourse();
        System.out.println("The lab fee of this offline course is :"+this.labFee);
    }
}
