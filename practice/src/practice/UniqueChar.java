package practice;

import java.util.Scanner;
import java.util.regex.Pattern;
public class UniqueChar {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s = sc.nextLine();
       int[] count = new int[300];
       int a=0,i,n=0,cnt=0;
       for(i=0;i<s.length();i++){
           char c = s.charAt(i);
           if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
           {
               break;
           }
           else
           {
               cnt++;
           }
       }
      if(cnt==s.length())
      {
          for ( i = 0; i < s.length(); i++)
          {
           if(s.charAt(i)!=' ') 
           {
              count[(int)s.charAt(i)]++;
                n = i;
           }
          }
       for (int j = 0; j < n+1; j++)
           if (count[(int)s.charAt(j)] == 1)
           {
               a=0;
           }
           else
           {
               a++;
           }
           if(a==n+1)
           {
        	   System.out.println("No unique characters");
           }
           else
           {
           System.out.println("Unique characters:");
           for (int k = 0; k < n+1; k++)
           {
              if (count[(int)s.charAt(k)] == 1)
              {
               System.out.println(s.charAt(k));
              }
           }
      }
           
      }
      else
      {
           System.out.println("Invalid sentence");
      }
      }
}
