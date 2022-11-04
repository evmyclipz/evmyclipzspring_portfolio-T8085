package com.nighthawk.spring_portfolio.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRespository extends JpaRepository<UserInfo,Long>{  //will search for excercises in sqlite
    //primary key datatype   

    Optional<UserInfo> findUserInfoByName(String name);

}
