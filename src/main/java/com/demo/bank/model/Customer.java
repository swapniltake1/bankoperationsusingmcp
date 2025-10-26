package com.demo.bank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String fullName;
    private LocalDate dob;
    private String gender;
    private String city;
    private String contactNo;
    private String email;

    @OneToMany(mappedBy="customer")
    private List<Account> accounts;

    @OneToMany(mappedBy="customer")
    private List<Loan> loans;

    @OneToMany(mappedBy="customer")
    private List<Card> cards;

    // Getters and setters
}
