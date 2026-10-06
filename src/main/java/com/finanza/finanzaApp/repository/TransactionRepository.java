package com.finanza.finanzaApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finanza.finanzaApp.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
