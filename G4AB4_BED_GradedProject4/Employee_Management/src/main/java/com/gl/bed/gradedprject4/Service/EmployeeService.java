package com.gl.bed.gradedprject4.Service;

import java.util.List;
import java.util.Optional;

import com.gl.bed.gradedprject4.Model.Employee;


public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	
	void deleteEmployeeById(Long empId);
	
	Employee updateEmployee(Employee employee);
	
	Optional<Employee> fetchEmployeeById(Long empId);
	
	List<Employee> fetchAllEmployee();
}
