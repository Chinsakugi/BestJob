package com.czy.controller;

import com.czy.domain.User;
import com.czy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public void register(User user){

    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User loginUser, HttpServletResponse response) throws IOException {
        List<User> userList = userService.findAllUser();
        Boolean flag = false;
        for (User user : userList){
            if (user.getPhone().equals(loginUser.getPhone())){
                if (user.getPassword().equals(loginUser.getPassword())){
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            return "direct:success";
        }
        else {
            response.getWriter().println(flag);
        }
        return null;
    }
}
