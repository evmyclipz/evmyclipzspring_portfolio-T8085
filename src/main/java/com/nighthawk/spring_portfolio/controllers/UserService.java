package com.nighthawk.spring_portfolio.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nighthawk.spring_portfolio.controllers.UserInfoRespository;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    private final UserInfoRespository userRepo;

    @Autowired
    public UserService(UserInfoRespository ur)
    {
        userRepo = ur;
    }

    public boolean userExists(String name)
    {
        Optional<UserInfo> exists = userRepo.findUserInfoByName(name);
        return exists.isPresent();
    }

    public UserInfo saveUser(UserInfo user)
    {
        return userRepo.save(user);
    }

    public List<UserInfo> getUsers()
    {
        return userRepo.findAll();
    }
    
    
}
