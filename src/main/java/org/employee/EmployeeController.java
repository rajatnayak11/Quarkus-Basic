package org.employee;

import java.util.List;


import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.employee.entity.Employee;
import org.employee.service.IEmployeeService;



@Path("/api/employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeController{

    @Inject
    private IEmployeeService employeeService;
    
    
    @GET
    public List<Employee> getAll()
    {
    	return this.employeeService.getAllEmployees();
    }
    
    
    @GET
    @Path("/{id}")
    public Employee getEmployeeById(@PathParam("id") long employeeId)
    {
    	return this.employeeService.getEmployeeById(employeeId);
    }
    
    
    @POST
    @Transactional
    public Employee addEmployee(Employee employee)
    {
    	return this.employeeService.addEmployee(employee);
    }
    
    @PUT
    @Transactional
    @Path("/{id}")
    public Employee updateEmployee(@PathParam("id") long employeeId, Employee employee)
    {
    	return this.employeeService.updateEmployee(employeeId, employee);
    }
    
    @DELETE
    @Transactional
    @Path("{id}")
    public void deleteEmployeeById(@PathParam("id") long employeeId)
    {
    	this.employeeService.deleteEmployeeById(employeeId);
    }
	
	
}