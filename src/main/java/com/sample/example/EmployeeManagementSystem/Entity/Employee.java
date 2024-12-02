package com.sample.example.EmployeeManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="EmployeeInfo")
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long eId;
        private String ename;
        private String email;
        private String deprtment;

        private  boolean isActive;
        private String createdBy;
        private LocalDateTime createdDate;
        private  String updatedBy;
        private LocalDateTime updatedDate;

}
