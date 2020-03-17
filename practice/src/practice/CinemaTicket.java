package practice;

import java.util.Scanner;

public class CinemaTicket 
{
	public static void main(String[] args) 
	{
	    double t1=0;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tickets=sc.nextInt();
		System.out.println("Enter the no of ticket:");
        String c=sc.next();
        System.out.println("Do you want refreshment:");
        String ch=sc.next();
        System.out.println("Do you have coupon code:");
	    String cha=sc.next();
	    System.out.println("Enter the circle:");
	    if(tickets>=5&&tickets<=40)
	    {   
	        if(cha.equals("k")||cha.equals("q"))
	        {
	            if(cha=="k")
	            {
	                t1=tickets*75;
	            }
	            else
	            {
	            	t1=tickets*150;
	            }
	        }
	        else
	        {
	            System.out.println("Invalid Input");
	        }
	    }
	    else
	    {
	     System.out.println("Minimum of 5 and Maximum of 40 Tickets");   
	    }
	}

}
