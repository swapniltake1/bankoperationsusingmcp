package com.demo.bank.repository;
import com.demo.bank.model.ATM;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface ATMRepository extends JpaRepository<ATM, Integer> {
    List<ATM> findByCity(String city);
}