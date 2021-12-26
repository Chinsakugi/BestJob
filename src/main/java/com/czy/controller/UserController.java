package com.czy.controller;

import com.czy.domain.User;
import com.czy.service.UserService;
import com.fasterxml.jackson.databind.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String  register(User user){
        User tempUser = userService.findUserByPhone(user.getPhone());
        if (tempUser==null){
            userService.insertUser(user);
            return "login";
        }else {
            return "register";
        }
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(String phone, String password, HttpSession session) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.login(phone,password);
        if (user!=null){
            session.setAttribute("user",user);
            modelAndView.setViewName("/../../index");
        }else{
            modelAndView.addObject("msg","用户名或密码错误");
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }
}
