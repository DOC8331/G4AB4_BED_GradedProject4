package com.gl.bed.gradedprject4.Service;

import org.springframework.stereotype.Service;

import com.gl.bed.gradedprject4.Model.Role;
import com.gl.bed.gradedprject4.Repository.RoleRepository;

@Service
public class RoleServiceImpl {
	
	private final RoleRepository roleRepository;

	public RoleServiceImpl(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}
	
	public Role saveRole(Role role) {
		System.out.println("Role "+ role.toString());
		return this.roleRepository.save(role);
	}
}
