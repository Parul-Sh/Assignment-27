package com.test.assignment_26nov;
import java.util.*;
public class Employee {
	private String name;
	private int age;
	private String dob;
	private String city;
	private long salary;
	
  Employee(){ // Default constructor
	  
  }
	
 
public Employee(String name,int age,String dob,String city,long salary) { // Parameterized constructor
	 this.name=name;
	 this.age=age;
	 this.dob=dob;
	 this.city = city;
	 this.salary=salary;
 }	
	//  getters and setters
	public final void setName(String name) {
	this.name = name;
}
public final void setAge(int age) {
	this.age = age;
}

public final void setDob(String dob) {
	this.dob = dob;
}

public final void setCity(String city) {
	this.city = city;
}


public final void setSalary(long salary) {
	this.salary = salary;
}
 

	public static void main(String[] args) {
				
		Employee e1=new Employee();//Setting employee fields using default constructor for this object
		e1.setName("Surbhi");
       		e1.setAge(30);
		e1.setCity("Indore");
		e1.setDob("22/1/1989");
	        e1.setSalary(50000);
	    
	    
		Employee e2=new Employee();//Setting employee fields using default constructor for this object
		e2.setName("Apoorva");
        	e2.setAge(30);
		e2.setCity("Pune");
		e2.setDob("22/3/1989");
	        e2.setSalary(50000);
	    
		Employee e3=new Employee();//Setting employee fields using default constructor for this object
		e3.setName("Divy");
        	e3.setAge(30);
		e3.setCity("Satyam");
		e3.setDob("24/4/1989");
	        e3.setSalary(50000);
	    
		Employee e4=new Employee();//Setting employee fields using default constructor for this object
		e4.setName("Sonia");
        	e4.setAge(30);
		e4.setCity("Solan");
		e4.setDob("29/1/1989");
	        e4.setSalary(50000);
	    
		Employee e5=new Employee();//Setting employee fields using default constructor for this object
		e5.setName("Kishore");
        	e5.setAge(30);
		e5.setCity("Bhopal");
		e5.setDob("24/1/1989");
	        e5.setSalary(50000);
		
	        //Setting employee fields using parameterized constructor for this object
		
		Employee e6=new Employee("Priya",23,"22/1/1996","Indore",29999);
		Employee e7=new Employee("Sagar",22,"2/1/1997","Pune",45000);
		Employee e8=new Employee("Shriya",22,"12/1/1997","Bhopal",25000);
		Employee e9=new Employee("Shubham",23,"26/1/1996","Hyderabad",48000);
		Employee e10=new Employee("Rajal",23,"16/3/1996","Banglore",28000);


	}
	

}
