package com.lucasreis.curso.repositories;
import com.lucasreis.curso.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
