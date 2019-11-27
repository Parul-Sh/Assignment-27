package com.test.assignment_26nov;
import java.util.*;

public class Series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" value of n :");
		
				int n = scan.nextInt();
		
		printFibonacciSeries(n);
	}
    public static void printFibonacciSeries(int n)
    {
	    	
    	int[] a = new int[n];
    	a[0]=0;
    	a[1]=1;
    	a[2]=1;
    	a[3]=2;
    	for(int i=0;i<4;i++)
    	{
    	System.out.print(a[i] + " ");}
    	for(int i=0;i<n-4;i++) {
    		a[i+4]=a[i]+a[i+1]+a[i+2]+a[i+3];
    		System.out.print(a[i+4] + " ");
    	}
 

	}

}
