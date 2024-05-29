package com.example.evalspringthymleaf.controller;

import com.example.evalspringthymleaf.model.Employee;
import com.example.evalspringthymleaf.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public String listProduct(Model model) {
        List<Employee> productList = employeeService.findAll();
        model.addAttribute("products", productList.size());
        return "product/list";
    }

//    @GetMapping("/new")
//    public String showForm(Model model) {
//        model.addAttribute("product", new Product());
//        model.addAttribute("categories", categoryService.findAll());
//        return "product/form";
//    }
//
//    @PostMapping()
//    public String valideForm(@Valid @ModelAttribute Product product, Model model, BindingResult result) {
//        if (result.hasErrors()) {
//            model.addAttribute("categories", categoryService.findAll());
//            return "product/form";
//        }
//        productService.save(product);
//        return "redirect:/products";
//    }


}
