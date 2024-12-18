package com.sample.example.EmployeeManagementSystem.repository;

import com.sample.example.EmployeeManagementSystem.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
