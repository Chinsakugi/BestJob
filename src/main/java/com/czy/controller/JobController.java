package com.czy.controller;

import com.czy.domain.Company;
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

    @RequestMapping(value = "/jobApply",method = RequestMethod.POST)
    @ResponseBody
    public Object jobApply(@RequestBody HttpSession session, Integer jobId){
        User user = (User) session.getAttribute("user");
        if (user==null){
            return "用户未登录，申请失败";
        }else {
            jobService.insertRecord(user.getId(), jobId);
            return "申请成功";
        }
    }

    @RequestMapping(value = "/jobs",method = RequestMethod.GET)
    @ResponseBody
    public Object jobs(@RequestParam("session")HttpSession session){
        Company company = (Company) session.getAttribute("company");
        List<Job> jobList = jobService.findJobByCompany(company.getId());
        return jobList;
    }

    @RequestMapping(value = "/jobs",method = RequestMethod.POST)
    @ResponseBody
    public Object insertJob(@RequestParam("session")HttpSession session, @RequestBody Job job){
        Company company = (Company) session.getAttribute("company");
        if (company==null){
            return "添加失败";
        }
        jobService.insertJob(job.getJobName(),job.getJobInfo(),job.getJobAddress(),job.getSalary(),
                             job.getJobDescription(),job.getJobCategory(),job.getJobRequire(),
                             company.getId(),job.getPostTime());
        return "添加成功";
    }

    @RequestMapping(value = "/jobs",method = RequestMethod.DELETE)
    @ResponseBody
    public Object insertJob(@RequestParam("session")HttpSession session, @RequestParam("id") Integer jobId){
        Company company = (Company) session.getAttribute("company");
        if (company==null){
            return "删除失败";
        }else {
            jobService.deleteJob(jobId,company.getId());
            return "删除成功";
        }
    }

}
