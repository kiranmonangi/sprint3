package com.difficult.demorest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
		System.out.println("getemployee called ..........");
		return repo.getEmployeeById(id);
	}

	@POST
	@Path("employee")
	public Employee createEmployee(Employee e) {
		System.out.println("create employee is called......... ");
		System.out.println(e);
	    repo.create(e);
		return e;
	}

}
