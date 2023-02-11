package com.gl.bed.gradedprject4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.bed.gradedprject4.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}
