package com.demo.bank.service;

import com.demo.bank.model.Branch;
import com.demo.bank.repository.BranchRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BranchService {
    private final BranchRepository repo;
    public BranchService(BranchRepository repo){ this.repo = repo; }
    public List<Branch> getAllBranches(){ return repo.findAll(); }
}
