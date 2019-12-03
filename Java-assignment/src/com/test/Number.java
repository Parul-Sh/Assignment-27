package com.test;
import java.util.Scanner;

public class Number {
	public static void my() {
	Scanner scan = new Scanner(System.in);
	int a= scan.nextInt();//Scanning first number
	int b= scan.nextInt();//Scanning second number
	int c= scan.nextInt();//Scanning third number
	System.out.println("Greatest number is:");
	 if(a>=b)
	 {
		 if(a>=c)
		 {System.out.println(a);//Printing a as a is greatest}
		 else
		 {System.out.println(c);//Printing  c as c is greatest}
	 }
	 else
	 {
		 if(b>=c)
		 {System.out.println(b);//Printing b as b is greatest
		 else
			 System.out.println(c);//Printing c as c is greatest
	 }

	}
}
