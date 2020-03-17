package practice;

import java.util.Scanner;
public class IncrementCalculation{
    public static void main(String []args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        double s=sc.nextDouble();
        System.out.println("Enter the Performance appraisal rating");
        double r=sc.nextDouble();
        if(s>0 && r>=1 && r<=5)
        {
            if(r>1 && r<=3)
            {
                sum=(int) (s+s*0.10);
                System.out.println(sum);
            }
            else if(r>=3.1 && r<=4)
            {
                sum=(int) (s+s*0.25);
                System.out.println(sum);
            }
            else
            {
                sum=(int) (s+s*0.30);
                System.out.println(sum);
            }
        }
        else{
            System.out.println("Invalid Input");
            }
    }
}
