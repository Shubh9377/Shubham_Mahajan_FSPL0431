package com.sample.example.EmployeeManagementSystem.controller;

import com.sample.example.EmployeeManagementSystem.Entity.Designation;
import com.sample.example.EmployeeManagementSystem.dto.DesignationDto;
import com.sample.example.EmployeeManagementSystem.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/designation")
public class DesignationController {

    @Autowired
    DesignationService designationService;

    @PostMapping("/designationData")
    public ResponseEntity<Designation> addData (@RequestBody DesignationDto designationDTO){
        return new ResponseEntity<>(designationService.designationData(designationDTO),CREATED);
    }

    @GetMapping("/getDesignationData")
    public ResponseEntity<List<Designation>> getAllDesignation(){
        return new ResponseEntity<>(designationService.getAllDesignation(), HttpStatus.FOUND);
    }
}
