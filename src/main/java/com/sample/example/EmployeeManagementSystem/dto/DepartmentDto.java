package com.sample.example.EmployeeManagementSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DepartmentDto {
    private String deptName;

    private  boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private  String updatedBy;
    private LocalDateTime updatedDate;
}
