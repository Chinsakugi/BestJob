package com.czy.dao;

import com.czy.domain.User;
import org.apache.ibatis.annotations.Param;
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

    /**
     *登录操作  根据电话号码和密码
     */
    User findUserByPhoneAndPassword(@Param("phone") String phone, @Param("password") String password);

    /**
     *注册操作  查询电话号码是否已存在
     */
    User findUserByPhone(@Param("phone") String phone);

    User findUserById(Integer id);
}
