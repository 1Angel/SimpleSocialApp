package com.SocialApp.SimpleSocialApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SocialApp.SimpleSocialApp.entities.User;
import java.util.Optional;
import java.util.List;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByEmail(String email);
}
