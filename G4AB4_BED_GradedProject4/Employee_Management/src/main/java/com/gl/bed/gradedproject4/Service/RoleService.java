package com.gl.bed.gradedproject4.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.bed.gradedproject4.Model.Role;


public interface RoleService {
	Role saveRole(Role role);
	
	List<Role> fetchAllRoles();
}

