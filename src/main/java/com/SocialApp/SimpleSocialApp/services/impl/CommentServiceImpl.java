package com.SocialApp.SimpleSocialApp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SocialApp.SimpleSocialApp.entities.Comments;
import com.SocialApp.SimpleSocialApp.entities.Post;
import com.SocialApp.SimpleSocialApp.repositories.CommentsRepository;
import com.SocialApp.SimpleSocialApp.repositories.PostRepository;
import com.SocialApp.SimpleSocialApp.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentsRepository commentsRepository;


    @Autowired
    private PostRepository postRepository;

    @Override
    public Comments Create(Comments comments, Long postId) {

        Post post = postRepository.findById(postId).orElseThrow();

        Comments comment = new Comments();
        comment.setPost(post);
        comment.setDescription(comments.getDescription());
        comment.setCreatedDate(comments.getCreatedDate());

        var create = commentsRepository.save(comment);
        return create;
    }

    @Override
    public void Delete(Long commentId) {
        
        Comments comment = commentsRepository.findById(commentId).get();
        if(comment != null){
            commentsRepository.delete(comment);
        }

    }

}
