package com.ismarleycarvalho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismarleycarvalho.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
