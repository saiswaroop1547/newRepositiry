package practice;

import java.util.*;
public class PrimeNumbers { 
  
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        int a, b, i, j, flag=0;
        a = sc.nextInt(); 
        b = sc.nextInt();
        if(a>0&&b>0&&a<b)
        {
        for(i = a; i <= b; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
        }
        else
        System.out.println("Provide valid input");
    } 
}