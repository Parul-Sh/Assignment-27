package com.test;

public class Prime_Number {

	public static void main(String[] args) {
		
		int count=0;
		System.out.println("Prime numbers are:");
		for(int n=2;n<=100;n++) { // Iteration from 2 to 100 for finding prime numbers between them
        for(int i=2;i<(n/2);i++)//Iteration from 2 to n/2
        {
        	if((n%i)==0)
        	{
        		count++;//count=count+1
        	
        	}
        }
         //If count=0 means number is prime else not
        if(count==0)
        { System.out.println(n);
           
        	}
        count=0;
        }

	}

}
