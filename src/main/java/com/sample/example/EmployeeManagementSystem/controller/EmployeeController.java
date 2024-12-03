package com.sample.example.EmployeeManagementSystem.controller;

import com.sample.example.EmployeeManagementSystem.Entity.Employee;
import com.sample.example.EmployeeManagementSystem.dto.EmployeeDto;
import com.sample.example.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @PostMapping("/employeeData")
    public ResponseEntity<Employee> addData (@RequestBody EmployeeDto employeeDTO){
        return new ResponseEntity<>(employeeService.addData(employeeDTO),CREATED);
    }

    @GetMapping("/getData")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.FOUND);
    }




}
