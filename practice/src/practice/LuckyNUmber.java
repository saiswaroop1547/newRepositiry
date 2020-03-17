package practice;

import java.util.Scanner;

public class LuckyNUmber {

	public static void main(String[] args) 
	{int sum=0;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("Enter the car no:");
		int m=s.length();
		if(m==4)
		{
			int n=Integer.parseInt(s);
			while(n!=0)
			{	int r=n%10;
				sum=sum+r;
				n=n/10;
			}
			if(n%5==0||n%3==0||n%7==0)
			{
				System.out.println("Lucky Number");
			}
			else
			{
				System.out.println("Sorry its not my lucky number");
			}
			
		}
		else
		{
			System.out.println(s+"is not a valid car number");
		}
	}

}
