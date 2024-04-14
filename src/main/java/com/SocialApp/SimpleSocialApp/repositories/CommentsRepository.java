package com.SocialApp.SimpleSocialApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SocialApp.SimpleSocialApp.entities.Comments;

@Repository
public interface CommentsRepository  extends CrudRepository<Comments, Long>{

}
