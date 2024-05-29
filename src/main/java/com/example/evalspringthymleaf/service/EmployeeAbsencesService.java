package com.example.evalspringthymleaf.service;

import com.example.evalspringthymleaf.model.EmployeeAbsences;

import java.util.List;

public interface EmployeeAbsencesService {

    List<EmployeeAbsences> findAll();

    EmployeeAbsences findById(Long id);

    EmployeeAbsences save(EmployeeAbsences employeeAbsences);

    void deleteById(Long id);
}
