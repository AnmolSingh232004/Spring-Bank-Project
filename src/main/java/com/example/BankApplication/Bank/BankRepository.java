package com.example.BankApplication.Bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
    @Query("SELECT e FROM Bank e WHERE e.email = ?1")
    Optional<Bank> findByEmail(String email);

    @Query("SELECT p FROM Bank p WHERE p.email = ?1")
    Optional<Bank> findByPhoneNumber(Long number);

}
