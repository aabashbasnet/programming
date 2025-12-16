import java.util.Scanner;

/**
 * Write a description of class ArrayName here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayName
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String[] name={"Saroj","Sushant","Ujjwal","Rabina","Sandesh"};
    for(int i=0;i<name.length;i++)
    {
        System.out.println(name[i]);
    }
    System.out.println(name[2]);
    name[4]="Aabash";
    System.out.println(name[4]);
    System.out.println("Enter how many names you want to enter");
    int number= sc.nextInt();
    sc.nextLine();
    String[] array=new String[number];
    for(int i=0;i<array.length;i++)
    {
        System.out.println("Value at index: "+i);
        array[i]=sc.nextLine();
    }
    for(int i=0;i<array.length;i++)
    {
        System.out.println(array[i]);
    }
    }
    
}