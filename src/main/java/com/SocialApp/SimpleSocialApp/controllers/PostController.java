package com.SocialApp.SimpleSocialApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SocialApp.SimpleSocialApp.entities.Post;
import com.SocialApp.SimpleSocialApp.services.PostService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @Autowired
    private PostService postService;


    @GetMapping()
    public List<Post> AllPost(){
        return postService.AllPost();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Post> GetPostById(@PathVariable("id") Long id){
        Optional<Post> postOptional = postService.FindById(id);
        if(postOptional.isPresent()){
            return ResponseEntity.ok().body(postOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/create")
    public ResponseEntity<Post> Create(@Valid @RequestBody Post post){
        return ResponseEntity.status(HttpStatus.CREATED).body(postService.Create(post));
    }
}
