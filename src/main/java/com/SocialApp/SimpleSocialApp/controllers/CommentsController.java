package com.SocialApp.SimpleSocialApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SocialApp.SimpleSocialApp.entities.Comments;
import com.SocialApp.SimpleSocialApp.services.CommentService;

@RestController
@RequestMapping("/api/comments")
public class CommentsController {

    @Autowired
    private CommentService commentService;


    @PostMapping("/create/{postId}/post")
    public ResponseEntity<Comments> Create(@RequestBody Comments comments, @PathVariable("postId") Long postId){
        Comments comment = commentService.Create(comments, postId);
        return ResponseEntity.ok().body(comment);
    }
}
