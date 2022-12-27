package com.ust.employeeRegistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ustEmployee")
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
	private String name;
	private String location;
	private String domain;
	private String emailId;
	private int experience;
	
	
	
	public Employee() {
	}
	public Employee(int empId, String name, String location, String domain, String emailId, int experience) {
		super();
		this.empId = empId;
		this.name = name;
		this.location = location;
		this.domain = domain;
		this.emailId = emailId;
		this.experience = experience;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	
	

}
