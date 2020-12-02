package com.difficult.demorest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("employees")
public class EmployeeResource {
	EmployeeRepository repo;
	public EmployeeResource(){
	 repo=new EmployeeRepository();
	}

	@GET
	@Produces({MediaType.APPLICATION_XML})
	public List<Employee> getemployee() {
		System.out.println("get employee called.........");
		return repo.getEmployees();

	}

	@GET
	@Path("employee/{id}")
	@Produces({MediaType.APPLICATION_XML})

	public Employee getEmployee(@PathParam("id") int id) {
		System.out.println("getemployee called ............");
		return repo.getEmployeeById(id);
	}

	@POST
	@Path("employee")
	@Consumes({MediaType.APPLICATION_XML})
	public Employee createEmployee(Employee e) {
		System.out.println("create employee is called......... ");
		System.out.println(e);
	    repo.create(e);
		return e;
	}
	
	@DELETE
	@Path("employee/{id}")
	@Consumes({MediaType.APPLICATION_XML})
	public Employee deleteEmployee(@PathParam("id") int id) {
		System.out.println("delete employee called ..........");
		return repo.delete(id);
	}
	
	@PUT
	@Path("employee/{id}")
	@Consumes({MediaType.APPLICATION_XML})
	public Employee putEmployee(@PathParam("id") int id,Employee e){
		System.out.println("put(update) employee called ..........");
		System.out.print(e);
		return repo.update(id,e);
		
	}
	
	
}
