package com.czy.controller;

import com.czy.domain.User;
import com.czy.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    ResumeService resumeService;

    @RequestMapping("/personal")
    @ResponseBody
    public Object personal(@RequestParam("session") HttpSession session){
        User user = (User) session.getAttribute("user");
        if (user==null){
            return "您当前未登录";
        }else {
            return resumeService.showUserResume(user.getId());
        }
    }

}
