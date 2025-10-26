package com.demo.bank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "atm_locations")
public class ATM {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer atmId;
    private String location;
    private String city;
    private String status;

    @ManyToOne
    @JoinColumn(name="branch_id")
    private Branch branch;

    // Getters and setters
}
