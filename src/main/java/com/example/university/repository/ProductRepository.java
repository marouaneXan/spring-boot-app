package com.example.university.repository;

import com.example.university.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    void deleteById(Long id);
}
