import java.util.Scanner;

/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cinema
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age group \n (Child/Adult/Senior)");
    String AG = sc.nextLine();
        System.out.println("Please enter movie language \n (Hindi/English)");
    String ML = sc.nextLine();
        System.out.println("Are you a student?\n(Yes/No)");
    String student = sc.nextLine();
        System.out.println("Is it a festival day?\n(Yes/No)");
    String FD = sc.nextLine();
    double ticket;
            if(student=="Yes")
            {
            if(AG=="Child")
                {
                if(ML=="Hindi")
                    {
                       ticket=0.8*(150+50); 
                       System.out.println("Your ticket price is Rs "+ticket);
                    }
                else if(ML=="English")
                    {
                        ticket=0.8*(150+100);
                        System.out.println("Your ticket price is Rs "+ticket);
                    }
                }
            else if(AG=="Adult")
                {
                if(ML=="Hindi")
                    {
                       ticket=0.8*(250+50); 
                       System.out.println("Your ticket price is Rs "+ticket);
                    }
                else if(ML=="English")
                    {
                        ticket=0.8*(250+100);
                        System.out.println("Your ticket price is Rs "+ticket);
                    }
                }
            else if(AG=="Senior")
                {
                    if(ML=="Hindi")
                    {
                       ticket=0.8*(200+50); 
                       System.out.println("Your ticket price is Rs "+ticket);
                    }
                else if(ML=="English")
                    {
                        ticket=0.8*(200+100);
                        System.out.println("Your ticket price is Rs "+ticket);
                    }
                }
            }
            else
            {
                if(AG=="Child")
                {
                if(ML=="Hindi")
                    {
                       ticket=0.8*(150+50); 
                       System.out.println("Your ticket price is Rs "+ticket);
                    }
                else if(ML=="English")
                    {
                        ticket=0.8*(150+100);
                        System.out.println("Your ticket price is Rs "+ticket);
                    }
                }
            else if(AG=="Adult")
                {
                if(ML=="Hindi")
                    {
                       ticket=0.8*(250+50); 
                       System.out.println("Your ticket price is Rs "+ticket);
                    }
                else if(ML=="English")
                    {
                        ticket=0.8*(250+100);
                        System.out.println("Your ticket price is Rs "+ticket);
                    }
                }
            else if(AG=="Senior")
                {
                    if(ML=="Hindi")
                    {
                       ticket=200+50; 
                       System.out.println("Your ticket price is Rs "+ticket);
                    }
                else if(ML=="English")
                    {
                        ticket=200+100;
                        System.out.println("Your ticket price is Rs "+ticket);
                    }
                }
            }
            if(FD=="Yes")
                {
                if(AG=="Child")
                    {
                     if(ML=="Hindi")
                        {
                            ticket=0.8*(150+50); 
                            System.out.println("Your ticket price is Rs "+ticket);
                                }
                    else if(ML=="English")
                        {
                            ticket=0.8*(150+100);
                            System.out.println("Your ticket price is Rs "+ticket);
                        }
                    }
                else if(AG=="Adult")
                    {
                      if(ML=="Hindi")
                        {
                            ticket=0.8*(250+50); 
                            System.out.println("Your ticket price is Rs "+ticket);
                        }
                else if(ML=="English")
                    {
                        ticket=0.8*(250+100);
                        System.out.println("Your ticket price is Rs "+ticket);
                    }
                }
            else if(AG=="Senior")
                {
                    if(ML=="Hindi")
                    {
                       ticket=0.8*(200+50); 
                       System.out.println("Your ticket price is Rs "+ticket);
                    }
                else if(ML=="English")
                    {
                        ticket=0.8*(200+100);
                        System.out.println("Your ticket price is Rs "+ticket);
                    }
                }
                }
                else
                {
                    if(ML=="Hindi")
                        {
                            ticket=0.8*(150+50); 
                            System.out.println("Your ticket price is Rs "+ticket);
                                }
                    else if(ML=="English")
                        {
                            ticket=0.8*(150+100);
                            System.out.println("Your ticket price is Rs "+ticket);
                        }
                    
                else if(AG=="Adult")
                    {
                      if(ML=="Hindi")
                        {
                            ticket=0.8*(250+50); 
                            System.out.println("Your ticket price is Rs "+ticket);
                        }
                else if(ML=="English")
                    {
                        ticket=0.8*(250+100);
                        System.out.println("Your ticket price is Rs "+ticket);
                    }
                }
            else if(AG=="Senior")
                {
                    if(ML=="Hindi")
                    {
                       ticket=0.8*(200+50); 
                       System.out.println("Your ticket price is Rs "+ticket);
                    }
                else if(ML=="English")
                    {
                        ticket=0.8*(200+100);
                        System.out.println("Your ticket price is Rs "+ticket);
                    }
                    }
                }
                
            
    }
}