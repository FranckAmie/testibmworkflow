package com.example.testarvalk8s.repositories;

import com.example.testarvalk8s.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
