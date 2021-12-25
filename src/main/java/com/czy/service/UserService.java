package com.czy.service;

import com.czy.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();

    void insertUser(User user);

    void updateUser(User user);
}
