package com.ust.employeeRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ust.employeeRegistration.model.Employee;
import com.ust.employeeRegistration.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> getEmployees(int id) {
		return employeeRepository.findById(id);
	}

	public Employee updateEmp(Employee emp) {
		Employee employee = null;
		Optional<Employee> updEmployee = employeeRepository.findById(emp.getEmpId());
		if(updEmployee.isPresent()) {
			employee.setDomain(emp.getDomain());
			employee.setEmailId(emp.getEmailId());
			employee.setExperience(emp.getExperience());
			employee.setLocation(emp.getLocation());
			employee.setName(emp.getName());
		}
		else {
			return null;
		}
		return employeeRepository.save(employee);
	}

	
	public Optional<Employee> deleteEmp(int id) {
		Optional<Employee> emp = employeeRepository.findById(id);
		employeeRepository.deleteById(id);
		return emp;
	}

}
