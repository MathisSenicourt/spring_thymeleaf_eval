package com.example.evalspringthymleaf.service;

import com.example.evalspringthymleaf.model.Applicant;

import java.util.List;

public interface ApplicantService {

    List<Applicant> findAll();

    Applicant findById(Long id);

    Applicant save(Applicant applicant);

    void deleteById(Long id);
}
