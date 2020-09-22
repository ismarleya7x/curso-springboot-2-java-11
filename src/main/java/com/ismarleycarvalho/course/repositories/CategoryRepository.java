package com.ismarleycarvalho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismarleycarvalho.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
