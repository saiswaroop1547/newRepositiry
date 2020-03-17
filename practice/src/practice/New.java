package practice;

import java.util.Scanner;
import java.text.DecimalFormat;

public class New {
    public static void main(String[] args) {
        int no, refe, total = 0;
        double cost, sum, sum1, sum2, sum3;
        String ref, co, circle;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        no = s.nextInt();
        if (no < 5 || no > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
        }
        System.out.println("Do you want refreshment:");
        ref = s.next();
        System.out.println("Do you have a coupon code:");
        co = s.next();
        System.out.println("Enter the circle:");
        circle = s.next();
        if (circle == "k") {
            total = no * 75;
        } else if (circle == "q") {
            total = no * 150;
        } else {
            System.out.println("Invalid Input");
        }
        if (no > 20) {
            sum = ((0.1) * total);
            sum1 = total - sum;
            if (co == "y") {
                sum2 = ((0.2) * total);
                sum3 = sum1 - sum2;
                if (ref == "y") {
                    refe = no * 150;
                    cost = sum3 + refe;
                } else {
                    cost = sum3;
                }
            } else {
                cost = sum1;
            }
        } else {
            cost = total;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Ticket cost:" + df.format(cost));
    }
} 