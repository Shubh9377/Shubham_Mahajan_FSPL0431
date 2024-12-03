package com.sample.example.EmployeeManagementSystem.service;

import com.sample.example.EmployeeManagementSystem.Entity.Designation;
import com.sample.example.EmployeeManagementSystem.dto.DesignationDto;
import com.sample.example.EmployeeManagementSystem.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DesignationService {

    @Autowired
    private DesignationRepository designationRepository;

    public Designation designationData(DesignationDto designationDTO) {
        Designation designation = new Designation();


        designation.setDName(designationDTO.getDName());
        designation.setActive(true);
        designation.setCreatedBy(designationDTO.getCreatedBy());
        designation.setUpdatedBy(designationDTO.getUpdatedBy());
        designation.setCreatedDate(LocalDateTime.now());
        designation.setUpdatedDate(LocalDateTime.now());

        return designationRepository.save(designation);

    }
    public List<Designation> getAllDesignation(){
        List<Designation> designationList = designationRepository.findAll();
        return designationList;
    }

}
