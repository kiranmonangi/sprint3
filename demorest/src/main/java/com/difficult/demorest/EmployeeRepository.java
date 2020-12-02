package com.difficult.demorest;

import java.util.List;

public class EmployeeRepository
{
    SingletonDB db = SingletonDB.getInstance();    
  
    	
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

		public Employee delete(int id)
    	{
    	   
				Employee e =getEmployeeById(id);
				if(e.getId()!=0){
					db.employees.remove(e);
					System.out.println("delete method called");
				}
				return null;
    	}

		public Employee update(int id,Employee e) {
			System.out.print("update  method called.........");
			Employee e1= getEmployeeById(id);
			if (e1!=null){
		     int index=db.employees.indexOf(e1);
		     System.out.println("index is" +index);
		     
		     
	    	 db.employees.set(index,e);
			}
			return e;
		}
		

  }

