package com.sample.example.EmployeeManagementSystem.controller;

import com.sample.example.EmployeeManagementSystem.Entity.Department;
import com.sample.example.EmployeeManagementSystem.dto.DepartmentDto;
import com.sample.example.EmployeeManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/departmentData")
    public ResponseEntity<Department> addData (@RequestBody DepartmentDto departmentDTO){
        return new ResponseEntity<>(departmentService.departmentData(departmentDTO),CREATED);
    }

    @GetMapping("/getDepartmentData")
    public ResponseEntity<List<Department>> getAllDepartment(){
        return new ResponseEntity<>(departmentService.getAllDepartment(), HttpStatus.FOUND);
    }

}
