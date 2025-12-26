package Week7.Week8;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        // invoking a method or method invocation
        
        calc.displayInfo();
        calc.add(1,2);//actual parameters
        calc.add(30,40);
        calc.add(50,70);
        calc.getFixedNumber();
        System.out.println("The fix number is :"+calc.getFixedNumber());
        int fixNum= calc.getFixedNumber();
        System.out.println(fixNum);
        
        int multi=calc.multiply(10,20);
        int multi1=calc.multiply(30,40);
        
        System.out.println("The multiplication of first two numbers are"+ multi);
        Calculator.square(10);
    }
}