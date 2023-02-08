package org.employee.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.employee.dao.EmployeeDAO;
import org.employee.entity.Employee;


@ApplicationScoped
public class EmployeeServiceImpl implements IEmployeeService {

	@Inject
	private EmployeeDAO  employeeDAO;
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = employeeDAO.listAll();
		return employeeList;
	}

	@Override
	public Employee getEmployeeById(long employeeId) {
		Employee employee = employeeDAO.findById(employeeId);
		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeDAO.persist(employee);
		return employee;
	}

	@Override
	public void deleteEmployeeById(long employeeId) {
		Employee employee = employeeDAO.findById(employeeId);
		employeeDAO.delete(employee);
	}

	@Override
	public Employee updateEmployee(long employeeId, Employee employee) {
		Employee findEmployee = employeeDAO.findById(employeeId);
		findEmployee.setEmployeeName(employee.getEmployeeName());
		findEmployee.setEmployeeEmail(employee.getEmployeeEmail());
		findEmployee.setEmployeeAge(employee.getEmployeeAge());
		findEmployee.setEmployeeDesignation(employee.getEmployeeDesignation());
		findEmployee.setEmployeeAddress(employee.getEmployeeAddress());
		findEmployee.setEmployeeYOE(employee.getEmployeeYOE());
		employeeDAO.persist(findEmployee);
		return findEmployee;
	}

}
