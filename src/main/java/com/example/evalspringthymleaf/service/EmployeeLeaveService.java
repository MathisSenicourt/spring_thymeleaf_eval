package com.example.evalspringthymleaf.service;

import com.example.evalspringthymleaf.model.EmployeeLeave;

import java.util.List;

public interface EmployeeLeaveService {

    List<EmployeeLeave> findAll();

    EmployeeLeave findById(Long id);

    EmployeeLeave save(EmployeeLeave employeeLeave);

    void deleteById(Long id);
}
