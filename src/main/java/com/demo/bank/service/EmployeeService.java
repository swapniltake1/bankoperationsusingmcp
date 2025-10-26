package com.demo.bank.service;

import com.demo.bank.model.Employee;
import com.demo.bank.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repo;
    public EmployeeService(EmployeeRepository repo){ this.repo = repo; }
    public List<Employee> getAllEmployees(){ return repo.findAll(); }
}
