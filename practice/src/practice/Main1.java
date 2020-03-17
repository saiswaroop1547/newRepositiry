package practice;

import java.util.Scanner;

public class Main1 {

	public static Associate getAssociateDetails() 
	{
		 Scanner sc=new Scanner(System.in);
		   Associate a=new Associate();
		    System.out.println("Enter the associate id:");
		    a.setAssociateId(sc.nextInt());
		    System.out.println("Enter the associate name:");
		    a.setAssociateName(sc.next());
		    //System.out.println("Enter the number of days:");
		    //a.setWorkStatus(sc.next());
		    return a;
		
	}
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
		 Associate a=getAssociateDetails();
		 
		
	}

}
