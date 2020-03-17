package practice;

import java.util.Scanner;

public class Test 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double sum=0,avg;
	//double d=sc.nextDouble();
	int n=sc.nextInt();
	System.out.println("Enter total no.of employees:");
	calculateAverage(	);
	
}

private static void calculateAverage(int[] age) {
	// TODO Auto-generated method stub
	        if(n>1){
	        System.out.println("Enter the age for "+n+" employees:");
	        int a[]=new int[n];
	        for(int i=0;i<n;i++){
	            int x=sc.nextInt();
	            if(x>=28 && x<=40){
	            a[i]=x;
	            sum=sum+a[i];}
	            else{
	                System.out.println("Invalid age encountered!");
	            }
	        }
	        avg=sum/n;
	        System.out.printf("The average age is %.2f\n",avg);}
	        else{
	            System.out.println("Please enter a valid employee count");
	        }
	       
	    }
	}

}
}
