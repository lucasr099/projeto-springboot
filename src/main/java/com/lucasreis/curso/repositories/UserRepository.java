package com.lucasreis.curso.repositories;

import com.lucasreis.curso.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
