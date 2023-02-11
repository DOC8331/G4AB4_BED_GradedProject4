package com.gl.bed.gradedprject4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.bed.gradedprject4.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("SELECT u FROM User u WHERE u.user_name = ?1")
	public User getUserByUsername(String username);
}
