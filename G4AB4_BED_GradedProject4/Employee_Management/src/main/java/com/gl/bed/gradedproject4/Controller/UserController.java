package com.gl.bed.gradedproject4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gl.bed.gradedproject4.Model.User;
import com.gl.bed.gradedproject4.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public User addUser(User user) {
		return userService.addUser(user);
	}
	
}
