package com.SocialApp.SimpleSocialApp.services;

import java.util.List;

import com.SocialApp.SimpleSocialApp.entities.User;

public interface UserService {

    List<User> findAll();

    User save(User user);
}
