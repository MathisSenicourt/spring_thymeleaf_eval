package com.example.evalspringthymleaf.service.impl;

import com.example.evalspringthymleaf.model.EmployeeLeave;
import com.example.evalspringthymleaf.repository.EmployeeRepository;
import com.example.evalspringthymleaf.service.EmployeeLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeLeaveImpl implements EmployeeLeaveService {

    @Autowired
    EmployeeRepository employeeLeaveService;


    @Override
    public List<EmployeeLeave> findAll() {
        return null;
    }

    @Override
    public EmployeeLeave findById(Long id) {
        return null;
    }

    @Override
    public EmployeeLeave save(EmployeeLeave employeeLeave) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
