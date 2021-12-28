package com.czy.controller;

import com.czy.domain.User;
import com.czy.service.UserService;
import com.fasterxml.jackson.databind.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public Object register(@RequestBody User user){
        User tempUser = userService.findUserByPhone(user.getPhone());
        if (tempUser==null){
            userService.insertUser(user);
            return "注册成功";
        }else {
            return "注册失败，电话号码已存在!";
        }
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(@RequestBody User user,HttpSession session){
        String phone = user.getPhone();
        String password = user.getPassword();
        User loginUser = userService.login(phone,password);
        if (loginUser==null) {
            return "用户名或密码错误!";
        } else {
            session.setAttribute("user",loginUser);
            return session;
        }
    }
}
