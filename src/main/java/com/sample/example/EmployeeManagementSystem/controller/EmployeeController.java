package com.sample.example.EmployeeManagementSystem.controller;

import com.sample.example.EmployeeManagementSystem.Entity.Employee;
import com.sample.example.EmployeeManagementSystem.dto.EmployeeDto;
import com.sample.example.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @PostMapping("/employeeData")
    public ResponseEntity<Employee> addData (EmployeeDto employeeDTO){
        return new ResponseEntity<>(employeeService.addData(employeeDTO),CREATED);


    }



}
