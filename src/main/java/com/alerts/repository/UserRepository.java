package com.alerts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alerts.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
