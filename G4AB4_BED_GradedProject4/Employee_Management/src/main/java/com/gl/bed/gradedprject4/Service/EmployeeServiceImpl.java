package com.gl.bed.gradedprject4.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.gl.bed.gradedprject4.Model.Employee;
import com.gl.bed.gradedprject4.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public Employee saveEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}
	
	public void deleteEmployeeById(int empId) {
		this.employeeRepository.deleteById(empId);
	}
	
	public Employee updateEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}
	
	public Employee fetchEmployeeById(int empId) {
		return this.employeeRepository.getById(empId);
	}
	
	public List<Employee> fetchAllEmployee() {
		return this.employeeRepository.findAll();
	}
}
