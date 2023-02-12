package com.gl.bed.gradedproject4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.bed.gradedproject4.Model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
