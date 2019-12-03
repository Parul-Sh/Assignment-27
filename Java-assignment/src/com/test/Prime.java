package com.test;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//Initializing the scanner object 
		int n = scan.nextInt();//Scanning the number to check if it is prime or not
		int count=0;
        for(int i=2;i<(n/2);i++)//Iterate from 2 to n/2
        {
        	if((n%i)==0)
        	{
        		count++;
        	}
        }
		// if count =  0 means the number is prime else not
        if(count == 0)
        {
        	System.out.println("Prime Number");
        }
        else
        	System.out.println("Composite Number");

        
	}

}
