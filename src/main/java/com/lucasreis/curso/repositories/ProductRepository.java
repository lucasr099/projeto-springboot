package com.lucasreis.curso.repositories;

import com.lucasreis.curso.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
