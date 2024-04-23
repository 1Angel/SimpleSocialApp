package com.SocialApp.SimpleSocialApp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SocialApp.SimpleSocialApp.entities.User;
import com.SocialApp.SimpleSocialApp.repositories.UserRepository;
import com.SocialApp.SimpleSocialApp.services.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return (List<User>) userRepository.findAll();
    }


    @Override
    @Transactional
    public User save(User user) {
        // TODO Auto-generated method stub
        return userRepository.save(user);
    }

}
