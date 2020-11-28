package com.difficult.demorest;

import java.util.ArrayList;
import java.util.List;

public class SingletonDB {	
    public List<Employee> employees;
    private static final SingletonDB instance = new SingletonDB(); 
    private SingletonDB() 
    
    { 
    	System.out.println("singletondb constructor called...");
    	employees = new ArrayList<>();

    	Employee emp1 =new Employee();		
    	emp1.setName("kiran");
    	emp1.setSalary(50000);
    	emp1.setId(101);
    	
    	Employee emp2 =new Employee();		
    	emp2.setName("manoj");
    	emp2.setSalary(45000);
    	emp2.setId(102);
    	
    	Employee emp3 =new Employee();		
    	emp3.setName("tejasri");
    	emp3.setSalary(40000);    
    	emp3.setId(103);
    	
    	employees.add(emp1);
    	employees.add(emp2);
    	employees.add(emp3);
    } 
    public static SingletonDB getInstance(){ 
          return instance; 
      } 
}
