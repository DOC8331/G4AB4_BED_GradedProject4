package com.gl.bed.gradedproject4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import com.gl.bed.gradedproject4.Model.Employee;


public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	
	void deleteEmployeeById(Long empId);
	
	Optional<Employee> updateEmployee(Employee employee);
	
	Optional<Employee> fetchEmployeeById(Long empId);
	
	List<Employee> fetchAllEmployee();
	
	List<Employee> searchEmployeeByFirstName(String firstName);
	
	List<Employee> getListOfEmployeesSortedByFirstName(Direction order);
}
