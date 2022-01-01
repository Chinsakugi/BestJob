package com.czy.controller;

import com.czy.domain.Company;
import com.czy.domain.Resume;
import com.czy.domain.User;
import com.czy.service.CompanyService;
import com.czy.service.ResumeService;
import com.czy.service.UserService;
import com.fasterxml.jackson.databind.Module;
import org.apache.commons.lang3.math.NumberUtils;
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
import java.util.regex.Pattern;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    ResumeService resumeService;

    @Autowired
    CompanyService companyService;

    //2

    @PostMapping("/register")
    @ResponseBody
    public Object register(@RequestBody User user){
        User tempUser = userService.findUserByPhone(user.getPhone());
        if (tempUser==null){
            userService.insertUser(user);
            //System.out.println(user);
            //mybatis中已配置  可直接获取刚插入的用户id
            Resume resume = new Resume();
            resume.setUserId(user.getId());
            resumeService.insertResume(resume);
            return "注册成功";
        }else {
            return "注册失败，电话号码已存在!";
        }
    }

    //1

    @PostMapping("/login")
    @ResponseBody
    public Object login(@RequestBody User user,HttpSession session){
        String phone = user.getPhone();
        String password = user.getPassword();

        Boolean isUser = NumberUtils.isDigits(phone);
        //判断用户为普通用户还是企业用户
        if (isUser){
            User loginUser = userService.login(phone,password);
            if (loginUser==null) {
                return "用户名或密码错误!";
            } else {
                session.setAttribute("user",loginUser);
                return loginUser.getPhone();
            }
        }else {
            Company companyUser = companyService.login(phone,password);
            if (companyUser==null){
                return "企业用户不存在或密码错误";
            }else {
                session.setAttribute("company",companyUser);
                return companyUser.getUsername();
            }
        }

    }
}
