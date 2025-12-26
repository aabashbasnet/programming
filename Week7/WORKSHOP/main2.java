package Week7.WORKSHOP;


/**
 * Write a description of class main2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main2
{
    public static void main(String[] args)
    {
    BankAccount ba1=new BankAccount(1,"Aabash",99999990);
        ba1.deposit();
        ba1.withdraw();
        ba1.display();
        BankAccount ba2=new BankAccount(2,"Garreb",9);
        ba2.deposit();
        ba2.withdraw();
        ba2.display();
    }
}