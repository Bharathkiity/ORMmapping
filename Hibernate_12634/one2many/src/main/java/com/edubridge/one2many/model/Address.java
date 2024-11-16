package com.edubridge.one2many.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table
@Entity(name="address002")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private String employeeTemporaryAddress;
	 private String employeePermanentAddress;
	 private String employeeLocalAddress;
	 
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="employee_id")
	
	private Employee employee;
	

	public String getEmployeeTemporaryAddress() {
		return employeeTemporaryAddress;
	}

	public void setEmployeeTemporaryAddress(String employeeTemporaryAddress) {
		this.employeeTemporaryAddress = employeeTemporaryAddress;
	}

	public String getEmployeePermanentAddress() {
		return employeePermanentAddress;
	}

	public void setEmployeePermanentAddress(String employeePermanentAddress) {
		this.employeePermanentAddress = employeePermanentAddress;
	}

	public String getEmployeeLocalAddress() {
		return employeeLocalAddress;
	}

	public void setEmployeeLocalAddress(String employeeLocalAddress) {
		this.employeeLocalAddress = employeeLocalAddress;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [employeeTemporaryAddress=" + employeeTemporaryAddress + ", employeePermanentAddress="
				+ employeePermanentAddress + ", employeeLocalAddress=" + employeeLocalAddress + ", employee=" + employee
				+ "]";
	}
	
	
	 
	 
	 
}
