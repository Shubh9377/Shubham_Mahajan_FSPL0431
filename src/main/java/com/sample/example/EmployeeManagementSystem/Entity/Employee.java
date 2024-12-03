package com.sample.example.EmployeeManagementSystem.Entity;

import jakarta.persistence.*;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name="EmployeeInfo")
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long eId;
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
