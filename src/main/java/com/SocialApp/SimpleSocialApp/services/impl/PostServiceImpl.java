package com.SocialApp.SimpleSocialApp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SocialApp.SimpleSocialApp.entities.Post;
import com.SocialApp.SimpleSocialApp.repositories.PostRepository;
import com.SocialApp.SimpleSocialApp.services.PostService;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> AllPost() {
        return (List<Post>) postRepository.findAll();

    }

    @Override
    public Post Create(Post post) {
        return postRepository.save(post);
        
    }

    @Override
    public Optional<Post> FindById(Long id) {
        return postRepository.findById(id);
    }

}
