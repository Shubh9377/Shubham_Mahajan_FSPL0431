package com.sample.example.EmployeeManagementSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DesignationDto {
    private String dName;

    private  boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private  String updatedBy;
    private LocalDateTime updatedDate;
}
