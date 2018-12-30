package com.example.filerouge.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.filerouge.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

}
