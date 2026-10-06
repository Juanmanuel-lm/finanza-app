package com.finanza.finanzaApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finanza.finanzaApp.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
