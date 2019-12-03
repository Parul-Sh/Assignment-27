package com.test.assignment_26nov;
import java.util.*;

public class Series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//Initialize the Scanner object

		System.out.println(" value of n :");
		
				int n = scan.nextInt();//Scanning the elements in fabonacci series to be displayed
		
		printFibonacciSeries(n);
	}
    public static void printFibonacciSeries(int n)
    {
	    	
    	int[] a = new int[n];//Declaring an array
    	a[0]=0;
    	a[1]=1;
    	a[2]=1;
    	a[3]=2;
    	for(int i=0;i<4;i++)//Iterate from 0 to 3
    	{
    	System.out.print(a[i] + " ");}
    	for(int i=0;i<n-4;i++) { //Iterate from 0 to n-4
    		a[i+4]=a[i]+a[i+1]+a[i+2]+a[i+3]; //Add the previous 4  numbers to get the current number 
    		System.out.print(a[i+4] + " ");//Printing the current number
    	}
 

	}

}
