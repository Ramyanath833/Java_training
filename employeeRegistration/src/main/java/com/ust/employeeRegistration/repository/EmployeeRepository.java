package com.ust.employeeRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.employeeRegistration.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


}
