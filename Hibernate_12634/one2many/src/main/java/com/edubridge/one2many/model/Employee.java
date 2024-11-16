package com.edubridge.one2many.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table
@Entity(name="employee002")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String employeeName;
	private String employeeEmail;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Address> addresses = new ArrayList<>();
	
	
	

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
	

	public List<Address> getAddresses() {
		return addresses;
	}



	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}



	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeEmail=" + employeeEmail + "]";
	}
	 

}
