package com.alerts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alerts.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
