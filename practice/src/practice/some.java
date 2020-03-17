package practice;

import java.util.Scanner;

public class some {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(firstTwo(str));
	}
	public static String firstTwo(String str)
	{
		if(str.length()<=2)
			return str.replaceAll("A", " ");
		String str1=str.substring(0, 2);
		String str2=str.substring(2);
		return str1.replaceAll("A", "")+str2;
	}

}
