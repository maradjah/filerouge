package com.example.filerouge.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.filerouge.model.Role;
import com.example.filerouge.model.RoleName;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	Optional<Role> findByName(RoleName roleName);
}
