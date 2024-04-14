package com.SocialApp.SimpleSocialApp.services;

import java.util.List;
import java.util.Optional;

import com.SocialApp.SimpleSocialApp.entities.Post;

public interface PostService {

    Post Create(Post post);

    List<Post> AllPost();

    Optional<Post> FindById(Long id);

}
