package com.sample.example.EmployeeManagementSystem.repository;

import com.sample.example.EmployeeManagementSystem.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
