package com.czy.dao;

import com.czy.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    /**
     *查询所有用户
     */
    List<User> findAllUser();

    /**
     *添加用户
     */
    void insertUser(User user);

    /**
     *更新用户信息
     */
    void updateUser(User user);
}
