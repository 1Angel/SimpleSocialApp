package com.SocialApp.SimpleSocialApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SocialApp.SimpleSocialApp.entities.User;
import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<User, Long>{

    List<User> findByEmail(String email);

    List<User> findByUsername(String username);
    
}
