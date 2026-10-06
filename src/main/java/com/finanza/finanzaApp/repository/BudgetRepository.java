package com.finanza.finanzaApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finanza.finanzaApp.entity.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long>{

}
