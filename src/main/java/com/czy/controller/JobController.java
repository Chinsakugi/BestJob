package com.czy.controller;

import com.czy.domain.Job;
import com.czy.domain.Record;
import com.czy.domain.User;
import com.czy.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin
public class JobController {

    @Autowired
    JobService jobService;

    @RequestMapping(value = "/jobs",method = RequestMethod.GET)
    @ResponseBody
    public Object jobs(@RequestParam("keyword") String keyword){
        List<Job> jobList = jobService.findJobByCompanyNameAndJobCategory(keyword);
        return jobList;
    }

    @RequestMapping(value = "/wanted",method = RequestMethod.GET)
    @ResponseBody
    public Object wanted(@RequestParam("session")HttpSession session){
        User user = (User) session.getAttribute("user");
        List<Record> recordList = jobService.findRecordByUserId(user.getId());
        return recordList;
    }


}
