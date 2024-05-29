package com.example.evalspringthymleaf.repository;

import com.example.evalspringthymleaf.model.EmployeeAbsences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeAbsencesRepository extends JpaRepository<EmployeeAbsences, Long> {
}
