package com.czy.controller;

import com.czy.domain.Job;
import com.czy.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
