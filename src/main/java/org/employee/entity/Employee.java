package org.employee.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long employeeId;
	
	@Column
	private String employeeName = "";
	
	@Column
	private String employeeEmail ="";
	
	@Column
	private int employeeAge;
	
	@Column
	private String employeeDesignation = "";
	
	@Column
	private double employeeYOE = 0;
	
	@Column
	private String employeeAddress = "";
	
	public Employee() {}

	public Employee(long employeeId, String employeeName, String employeeEmail, int employeeAge,
			String employeeDesignation, double employeeYOE, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeAge = employeeAge;
		this.employeeDesignation = employeeDesignation;
		this.employeeYOE = employeeYOE;
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public double getEmployeeYOE() {
		return employeeYOE;
	}

	public void setEmployeeYOE(double employeeYOE) {
		this.employeeYOE = employeeYOE;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeAge=" + employeeAge + ", employeeDesignation=" + employeeDesignation
				+ ", employeeYOE=" + employeeYOE + ", employeeAddress=" + employeeAddress + "]";
	}
}