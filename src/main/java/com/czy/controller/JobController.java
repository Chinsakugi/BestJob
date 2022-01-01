package com.czy.controller;

import com.czy.domain.Company;
import com.czy.domain.Job;
import com.czy.domain.Record;
import com.czy.domain.User;
import com.czy.service.CompanyService;
import com.czy.service.JobService;
import com.czy.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class JobController {

    @Autowired
    JobService jobService;

    @Autowired
    UserService userService;

    @Autowired
    CompanyService companyService;

//    @GetMapping("/jobs")
//    @ResponseBody
//    public Object jobs(@RequestParam(value = "keyword", required = false) String keyword){
//        if (keyword ==null){
//            keyword = "字节跳动";
//        }
//        List<Job> jobList = jobService.findJobByCompanyNameAndJobCategory(keyword);
//        return jobList;
//    }

    //多条件筛选
    @GetMapping("/jobs")
    @ResponseBody
    public Object findByMultiCondition(@RequestParam(value = "keyword",required = false) String keyword, @RequestParam(value = "loc",required = false)String loc, @RequestParam(value = "search",required = false) String search,@RequestParam(value = "time",required = false) String time,
                                       @RequestParam(value = "money",required = false)String money, @RequestParam(value = "experience",required = false) String experience, @RequestParam(value = "education",required = false) String education, @RequestParam(value = "session",required = false)String username){

        if (username!=null){
            Company company = companyService.findCompanyByUsername(username);
            List<Job> jobList = jobService.findJobByCompany(company.getId());
            return jobList;
        }

        List<Job> jobList;
        if (keyword!=null){
            jobList = jobService.findJobByCompanyNameAndJobCategory(keyword);
        }else {
            jobList = jobService.findByMultiCondition(loc, search, time, money, experience, education);
        }
        return jobList;
    }//7, 8, 10


    @RequestMapping(value = "/wanted",method = RequestMethod.GET)
    @ResponseBody
    public Object wanted(@RequestParam("session")String phone){
        User user = userService.findUserByPhone(phone);
        List<Record> recordList = jobService.findRecordByUserId(user.getId());
        return recordList;
    }//6

    @RequestMapping(value = "/jobApply",method = RequestMethod.POST)
    @ResponseBody
    public Object jobApply(@RequestParam("session")String phone, @RequestBody Map<Object,Object> map){
        User user = userService.findUserByPhone(phone);
        String job = (String) map.get("job");
        Integer jobId = Integer.parseInt(job);
        System.out.println(user);
        System.out.println(job);
        System.out.println(jobId);
        if (user==null){
            return "用户未登录，申请失败";
        }else {
            jobService.insertRecord(user.getId(), jobId);
            return "申请成功";
        }
    }//9

    @PostMapping("/jobs")
    @ResponseBody
    public Object insertJob(@RequestParam("session")String username, @RequestBody Job job){
        Company company = companyService.findCompanyByUsername(username);
        if (company==null){
            return "添加失败";
        }
        LocalDate date = LocalDate.now();
        String postTime = date.toString();
        jobService.insertJob(job.getJobName(),job.getJobInfo(),job.getJobAddress(),job.getSalary(),
                             job.getJobDescription(),job.getJobCategory(),job.getJobRequire(),
                             company.getId(),postTime);
        return "添加成功";
    }//11

    @DeleteMapping("/jobs")
    @ResponseBody
    public Object deleteJob(@RequestParam("session")String username, @RequestParam("id") Integer jobId){
        Company company = companyService.findCompanyByUsername(username);
        if (company==null){
            return "删除失败";
        }else {
            jobService.deleteJob(jobId,company.getId());
            return "删除成功";
        }
    }//13

    @PutMapping("/jobs")
    @ResponseBody
    public Object updateJob(@RequestParam("session")String username,@RequestBody Job job){
        Company company = companyService.findCompanyByUsername(username);
        if (company==null){
            return "更新失败";
        }else{
            LocalDate date = LocalDate.now();
            String postTime = date.toString();
            System.out.println(job);
            jobService.updateJob(job.getId(),job.getJobName(),job.getJobInfo(),job.getJobAddress(),job.getSalary(),job.getJobDescription(),
                                 job.getJobCategory(),job.getJobRequire(),company.getId(),postTime);
            return "更新成功";
        }
    }//12

}
