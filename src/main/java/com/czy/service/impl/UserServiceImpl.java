package com.czy.service.impl;

import com.czy.dao.UserDao;
import com.czy.domain.User;
import com.czy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User findUserByPhone(String phone) {
        User user = userDao.findUserByPhone(phone);
        return user;
    }

    @Override
    public User login(String phone, String password) {
        User user = userDao.findUserByPhoneAndPassword(phone, password);
        return user;
    }
}
