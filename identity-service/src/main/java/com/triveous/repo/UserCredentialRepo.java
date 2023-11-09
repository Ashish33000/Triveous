package com.triveous.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.model.UserCredential;

public interface UserCredentialRepo extends JpaRepository<UserCredential, Integer> {
	
	 Optional<UserCredential> findByName(String username);

}
