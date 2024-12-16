package com.cts.Hotel_Management.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.Hotel_Management.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	boolean existsByEmail(String email);
	Optional<User> findByEmail(String email);

}
