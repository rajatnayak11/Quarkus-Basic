package org.employee.service;

import java.util.List;

import org.employee.entity.Employee;

public interface IEmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(long employeeId);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(long employeeId, Employee employee);
	public void deleteEmployeeById(long employeeId);

}
