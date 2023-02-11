package com.gl.bed.gradedprject4.Service;

import java.util.List;

import com.gl.bed.gradedprject4.Model.Employee;


public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public void deleteEmployeeById(Long empId);
	
	public Employee updateEmployee(Employee employee);
	
	public Employee fetchEmployeeById(Long empId);
	
	public List<Employee> fetchAllEmployee();
}
