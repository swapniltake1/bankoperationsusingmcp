package com.demo.bank.repository;
import com.demo.bank.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
        List<Branch> findByCity(String city);
    
}