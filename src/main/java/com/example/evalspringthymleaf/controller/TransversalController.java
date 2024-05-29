package com.example.evalspringthymleaf.controller;

import com.example.evalspringthymleaf.model.Employee;
import com.example.evalspringthymleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/transversal")
public class TransversalController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public String listProduct(Model model) {
        List<Employee> employeeList = employeeService.findAll();
        List<Employee> candidateList = employeeService.findAll();
        model.addAttribute("employeeSize", employeeList.size());
        model.addAttribute("candidateSize", candidateList.size());
        return "transversal/home";
    }
}
