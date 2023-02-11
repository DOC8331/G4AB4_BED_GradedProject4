package com.gl.bed.gradedprject4.Controller;

//import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;


import com.gl.bed.gradedprject4.Model.Employee;
import com.gl.bed.gradedprject4.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired 
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public List<Employee> getAllEmployeesEmps() {
		List<Employee> emp = employeeService.fetchAllEmployee();
		return emp;
	}
	@GetMapping("/getemployeebyid")
	@ResponseBody
	public Employee getEmployeesbyid(Long empId) {
		Employee emp = employeeService.fetchEmployeeById(empId);
		return emp;
	}
	
	
	@PostMapping("/add")
	public Employee save(String emp_firstname, String emp_lastname,  String emp_email) {
		Employee employee=new Employee();
		employee.setEmp_firstname(emp_firstname);
		employee.setEmp_lastname(emp_lastname);
		employee.setEmp_email(emp_email);
		return employeeService.saveEmployee(employee); 
		}			
	
	@PutMapping("/update")
	public Employee updateEmployee(Employee employee) {
		return employeeService.updateEmployee(employee); 
	}	 	
	
	@DeleteMapping("/delete")
	public void deleteEmployee(Long empid) {
		employeeService.deleteEmployeeById(empid);	
	}
	
	
//	@RequestMapping(value = "/403")
//	public ModelAndView accesssDenied(Principal user) {
//
//		ModelAndView model = new ModelAndView();
//
//		if (user != null) {
//			model.addObject("msg", "Hi " + user.getName() 
//			+ ", you do not have permission to access this page!");
//		} else {
//			model.addObject("msg", 
//			"You do not have permission to access this page!");
//		}
//
//		model.setViewName("403");
//		return model;
//	}
}
