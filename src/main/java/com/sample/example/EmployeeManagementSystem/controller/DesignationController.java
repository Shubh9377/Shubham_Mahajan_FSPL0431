package com.sample.example.EmployeeManagementSystem.controller;

import com.sample.example.EmployeeManagementSystem.Entity.Designation;
import com.sample.example.EmployeeManagementSystem.dto.DesignationDto;
import com.sample.example.EmployeeManagementSystem.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/designation")
public class DesignationController {

    @Autowired
    DesignationService designationService;

    @PostMapping("/designationData")
    public ResponseEntity<Designation> addData (DesignationDto designationDTO){
        return new ResponseEntity<>(designationService.designationData(designationDTO),CREATED);
    }
}
