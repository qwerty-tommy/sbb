package com.mysite.sbb.user;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser,Long> {
    Optional<SiteUser> findByUsername(String username);
}
