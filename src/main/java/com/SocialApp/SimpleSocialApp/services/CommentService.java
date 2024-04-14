package com.SocialApp.SimpleSocialApp.services;

import com.SocialApp.SimpleSocialApp.entities.Comments;

public interface CommentService {

    Comments Create(Comments comments, Long postId);
}
