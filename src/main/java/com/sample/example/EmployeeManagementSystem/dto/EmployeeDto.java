package com.sample.example.EmployeeManagementSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class EmployeeDto {
    private String eFirstName;
    private String eLastName;
    private String email;
    private String address;
    private String date_of_joining;
    private double salary;

    private  boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private  String updatedBy;
    private LocalDateTime updatedDate;


}
