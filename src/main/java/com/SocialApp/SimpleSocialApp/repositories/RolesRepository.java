package com.SocialApp.SimpleSocialApp.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SocialApp.SimpleSocialApp.entities.Roles;
import java.util.List;


@Repository
public interface RolesRepository extends CrudRepository<Roles, Long>{

    List<Roles> findByName(String name);
}
