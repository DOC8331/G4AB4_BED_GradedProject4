package com.gl.bed.gradedprject4.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gl.bed.gradedprject4.Model.Employee;
import com.gl.bed.gradedprject4.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired 
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public List<Employee> getAllEmployeesEmps() {
		List<Employee> emp = employeeService.fetchAllEmployee();
		return emp;
	}
	
//	@RequestMapping("/addForm")
//	public String addForm(ModelMap modelMap, @ModelAttribute ("student") Employee stud, @ModelAttribute ("String") String rError) {
//		
//		modelMap.addAttribute("student", stud);
//		if (rError!=null)
//			modelMap.addAttribute("Err", rError);
//		return "addForm";
//	}
//	
//	@RequestMapping("/save")
//	public String save(@ModelAttribute ("student") Employee thestud, ModelMap modelMap, RedirectAttributes ra) {
//		String err = "Record already exists";
//		String errL = "Fields cannot be blank";
//		
//		if(thestud.getStudName().isEmpty() || thestud.getStudDept().isEmpty() || thestud.getStudCountry().isEmpty()) {
//			ra.addFlashAttribute("student", thestud);
//			ra.addFlashAttribute("String", errL);
//			return "redirect:addForm"; 
//		}			
//		
//		if (studentService.saveStudent(thestud)!=null) {
//			return "redirect:list"; 
//		}
//		else {
//			System.out.println("STUD"+thestud.toString());
//			ra.addFlashAttribute("student", thestud);
//			ra.addFlashAttribute("String", err);
//			return "redirect:addForm"; 
//		}				
//	}
//	
//	@RequestMapping("/update")
//	public String update(@ModelAttribute ("student") Employee thestudent, ModelMap modelMap) {
//		studentService.updateStudent(thestudent); 
//		return "redirect:list"; 
//	}	 	
//	
//	@RequestMapping("/delete")
//	public String delete(@RequestParam("studId") int studId, ModelMap modelMap) {
//		studentService.deleteStudentById(studId);	
//		return "redirect:list"; 
//	}
//	
//	@RequestMapping("/showFormUpdate")
//	public String update(@RequestParam("studId") int studId, ModelMap modelMap) {
//		Employee stud = studentService.fetchStudentById(studId);
//		modelMap.addAttribute("student", stud);
//		return "update";
//	}
//	
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
