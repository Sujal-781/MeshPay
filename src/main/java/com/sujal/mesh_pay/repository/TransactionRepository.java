package com.sujal.mesh_pay.repository;

import com.sujal.mesh_pay.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
