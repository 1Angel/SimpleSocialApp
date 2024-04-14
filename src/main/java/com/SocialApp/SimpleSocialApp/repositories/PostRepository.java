package com.SocialApp.SimpleSocialApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SocialApp.SimpleSocialApp.entities.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long>{

}
