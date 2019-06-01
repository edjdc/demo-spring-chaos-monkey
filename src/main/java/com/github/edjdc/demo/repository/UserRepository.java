package com.github.edjdc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.edjdc.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
