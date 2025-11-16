package com.lucasreis.curso.repositories;

import com.lucasreis.curso.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
