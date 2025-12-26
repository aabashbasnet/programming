package Week7.Week8;


/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    //instance method
    //void return type
    public void displayInfo()
    {
        System.out.println("Welcome to Calculator App");
    }
    
    // void return type + parameters
    
    public void add(int a,int b) //formal parameters
    {
        int sum=a+b;
        System.out.println("Sum : "+sum);
    }
    
    //return type + no parameters
    
    public int getFixedNumber()
    {
        return 10;
    }
    public int multiply(int c, int d)
    {
        int mul=c*d;
        return mul;
    }
    
    //static method 
    public static int square(int a)
    {
        return a*a;
    }
}