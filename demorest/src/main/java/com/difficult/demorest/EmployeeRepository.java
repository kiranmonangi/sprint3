package com.difficult.demorest;

import java.util.List;

public class EmployeeRepository
{
    SingletonDB db = SingletonDB.getInstance();    
    public  EmployeeRepository()
    {
    	
    	System.out.println("Repository constructor is called");

    	
    }
    	
    	public List<Employee> getEmployees()
    	{
    		//System.out.println(db.employees.size());
    		return db.employees;
    		
    	}
    	
    	public Employee getEmployeeById(int id)
    	{
    	   
    		for (Employee e : db.employees)
    		{
    	       if(e.getId()==id){
    	    	   return e;
    	       }    	      
            }
    		 return null;
    	}

		public void create(Employee e) {
			// TODO Auto-generated method stub
			System.out.print("create method called/////////");
			db.employees.add(e);
		
			
			
		}

  }

