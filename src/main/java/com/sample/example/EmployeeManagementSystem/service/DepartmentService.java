package com.sample.example.EmployeeManagementSystem.service;

import com.sample.example.EmployeeManagementSystem.Entity.Department;
import com.sample.example.EmployeeManagementSystem.dto.DepartmentDto;
import com.sample.example.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department departmentData(DepartmentDto departmentDTO) {
        Department department = new Department();


        department.setDeptName(departmentDTO.getDeptName());
        department.setActive(true);
        department.setCreatedBy(departmentDTO.getCreatedBy());
        department.setUpdatedBy(departmentDTO.getUpdatedBy());
        department.setCreatedDate(LocalDateTime.now());
        department.setUpdatedDate(LocalDateTime.now());

        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartment(){
        List<Department> departmentList = departmentRepository.findAll();
        return departmentList;
    }

}
