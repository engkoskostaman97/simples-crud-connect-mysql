package com.crudsimplesjpa.belajarjavanew.repository;

import com.crudsimplesjpa.belajarjavanew.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
