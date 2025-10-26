package com.demo.bank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "branches")
public class Branch {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer branchId;
    private String branchName;
    private String branchCode;
    private String city;
    private String ifscCode;

    @OneToMany(mappedBy="branch")
    private List<Employee> employees;

    @OneToMany(mappedBy="branch")
    private List<Account> accounts;

    @OneToMany(mappedBy="branch")
    private List<Loan> loans;

    @OneToMany(mappedBy="branch")
    private List<ATM> atms;

    // Getters and setters
}
