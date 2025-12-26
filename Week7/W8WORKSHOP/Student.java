package Week7.W8WORKSHOP;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // attributes
    private String name;
    private int id;
    private String address;
    private long phoneNumber;
    static String collegeName;
    
    //constructors
    public Student(String name,int id,String address,long phoneNumber)
    {
     this.name=name;
     this.id=id;
     this.address=address;
     this.phoneNumber=phoneNumber;
    }
    
    
    //setters and getters method
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    
    public long getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    
    
    //getters and setters for id as well
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setCollegeName()
    {
        this.collegeName=collegeName;
    }
    
    public String getCollegeName()
    {
        return this.collegeName;
    }
    
    void displayInfo()
    {
        System.out.println("Name of student is "+this.name);
        System.out.println("Id of student is "+this.id);
        System.out.println("Address of student is "+this.address);
        System.out.println("Phone number of studentis "+this.phoneNumber);
        System.out.println("College name  of student is "+collegeName);
    }
}