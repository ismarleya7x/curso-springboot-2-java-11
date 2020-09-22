package com.ismarleycarvalho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismarleycarvalho.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
