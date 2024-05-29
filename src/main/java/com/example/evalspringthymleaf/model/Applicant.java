package com.example.evalspringthymleaf.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "name is required")
    private String name;

    @NotNull(message = "id number is required")
    private Double idnumber;

    @NotEmpty(message = "adress is required")
    private String adress;

    @NotNull(message = "date of birth is required")
    private Date dateofbirth;

    @NotEmpty(message = "mail is required")
    private String mail;

    @NotEmpty(message = "phone number is required")
    private int phonenumber;

    @NotEmpty(message = "domain is required")
    private String domain;

    @NotNull(message = "evaluation is required")
    private Double evaluation;

    @NotNull(message = "date of interview is required")
    private Date dateofinterview;

    @NotEmpty(message = "observation is required")
    private String observation;

}
