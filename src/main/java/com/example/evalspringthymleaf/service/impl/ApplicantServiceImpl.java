package com.example.evalspringthymleaf.service.impl;

import com.example.evalspringthymleaf.model.Applicant;
import com.example.evalspringthymleaf.repository.ApplicantRepository;
import com.example.evalspringthymleaf.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    ApplicantRepository applicantRepository;

    @Override
    public List<Applicant> findAll() {
        return applicantRepository.findAll();
    }

    @Override
    public Applicant findById(Long id) {
        return applicantRepository.findById(id).orElse(null);
    }

    @Override
    public Applicant save(Applicant applicant) {
        return applicantRepository.save(applicant);
    }

    @Override
    public void deleteById(Long id) {
        applicantRepository.deleteById(id);
    }
}
