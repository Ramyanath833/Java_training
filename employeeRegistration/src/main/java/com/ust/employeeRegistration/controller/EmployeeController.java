package com.ust.employeeRegistration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.employeeRegistration.model.Employee;
import com.ust.employeeRegistration.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/register")
	public Employee saveDetails(@RequestBody Employee emp){
		return employeeService.saveEmployee(emp);
	}
	
	@GetMapping("/ust/employee")
	public List<Employee> getAllEmployee() {
		return employeeService.getEmployees();
	}
	
	@GetMapping("ust/getById/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return employeeService.getEmployees(id);
	}
	
	@PutMapping("ust/employee/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmp(emp);
	}
	
	@DeleteMapping("ust/delete/{id}")
	public Optional<Employee> deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmp(id);
	}
	
	
}
