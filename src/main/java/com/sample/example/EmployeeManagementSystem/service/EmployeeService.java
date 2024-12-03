package com.sample.example.EmployeeManagementSystem.service;

import com.sample.example.EmployeeManagementSystem.Entity.Employee;
import com.sample.example.EmployeeManagementSystem.dto.EmployeeDto;
import com.sample.example.EmployeeManagementSystem.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public  Employee addData(EmployeeDto employeeDto) {
        Employee emp = new  Employee();

        emp.setEId(0L);
        emp.setEFirstName(employeeDto.getEFirstName());
        emp.setELastName(employeeDto.getELastName());
        emp.setEmail(employeeDto.getEmail());
        emp.setAddress(employeeDto.getAddress());
        emp.setDate_of_joining(employeeDto.getDate_of_joining());
        emp.setSalary(employeeDto.getSalary());

        emp.setActive(true);
        emp.setCreatedBy(employeeDto.getCreatedBy());
        emp.setCreatedDate(employeeDto.getCreatedDate());
        emp.setUpdatedBy(employeeDto.getUpdatedBy());
        emp.setUpdatedDate(employeeDto.getUpdatedDate());
        return employeeRepository.save(emp);





    }
}
