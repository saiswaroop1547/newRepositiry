package practice;

import java.util.*;
public class InitCap {
    public static void main(String[] args)
    {int count=0;
	 Scanner in = new Scanner(System.in);
	 System.out.print("Enter the String:");
	 String line = in.nextLine();
	 String upper_case_line = ""; 
     Scanner sc = new Scanner(line); 
        while(sc.hasNext()) 
        {
            String word = sc.next(); 
            
               if(word.charAt(0)>=65 && word.charAt(0)<=90)
               {
            	   upper_case_line=upper_case_line+""+word;
            	   //count++;
               }
               else
               {
               upper_case_line =upper_case_line + Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
               }
       }
        if(upper_case_line.equals(line))
        {
        	 System.out.println("First character of each word is already in uppercase");
        }
     System.out.println(upper_case_line.trim()); 
   }
}
