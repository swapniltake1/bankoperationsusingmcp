package com.demo.bank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String empName;
    private String designation;
    private Double salary;
    private LocalDate doj;

    @ManyToOne
    @JoinColumn(name="branch_id")
    private Branch branch;

    // Getters and setters
}
