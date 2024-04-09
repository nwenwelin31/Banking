package com.banking.bankSecure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.bankSecure.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Boolean existsByEmail(String email);
	Boolean existsByAccountNumber(String email);
}
