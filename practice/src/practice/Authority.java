package practice;

import java.util.Scanner;
public class Authority
{
    public static void main(String[] args) 
    {
        String a, b,d;
        Scanner s = new Scanner(System.in);
        System.out.println("Inmate's name:");
        a = s.nextLine();
        System.out.println("Inmate's father's name:");
        b = s.nextLine();
        for(int i=0;i<a.length();i++)
        {
        	char ch=a.charAt(i);
        	if(((int)ch>=65 && (int)ch<=90 )
        			||((int)ch>=97 && (int)ch<=122 ))
        	{
        	for(int j=0;j<b.length();j++)
        	{	
        		char c=a.charAt(j);
        		if(((int)c>=65 && (int)c<=90 )
            			||((int)c>=97 && (int)c<=122 ))
        		{
        	     Authority obj = new  Authority();
        	        d = obj.concat(a, b);
        	        System.out.println(d);
        	        break;
        		}
        		else
            	{
            		System.out.println("Invalid name");
            		break;
            	}
        	}
        	}
        	else
        	{
        		System.out.println("Invalid name");
        		break;
        	}
        }
    }
    String concat(String x, String y)
    {
        String z;
        z = x + " " + y;
        return z;
    }
}
