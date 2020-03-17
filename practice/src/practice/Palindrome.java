package practice;

import java.util.*;
class Palindrome
{
    public static void main (String[] args) 
    {
    	int cnt=0,i;
    	String str=" ",s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word :");
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            if(((int)s.charAt(i)>=65 &&  (int)s.charAt(i)<=90) 
            		|| ((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122))
            {
                cnt++;
            }
            else
            {
            	break;
            }
        }
        if(cnt==s.length())
        {
        	for(i=(s.length()-1);i>=0;i--)
        	{
        		str+=s.charAt(i);
        	}
        	
        	if(s.equalsIgnoreCase(str))
        	{
        		System.out.println("is a Palindrome");
        	}
            else
            {
            	System.out.println("is not a Palindrome");
            }
        }
        else
        {
        	System.out.println("Invalid Input");
        }
    }
}
