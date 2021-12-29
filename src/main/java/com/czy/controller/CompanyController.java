package com.czy.controller;

import com.czy.domain.Company;
import com.czy.domain.Job;
import com.czy.service.CompanyService;
import com.czy.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@CrossOrigin
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @Autowired
    JobService jobService;

    @RequestMapping("/companyInfo")
    public ModelAndView companyInfo(Integer companyId){
        ModelAndView modelAndView = new ModelAndView();
        List<Job> jobList = jobService.findJobList(companyId);
        Company company = companyService.findCompanyById(companyId);
        modelAndView.addObject("jobList",jobList);
        modelAndView.addObject("company",company);
        modelAndView.setViewName("companyInfo");
        return modelAndView;
    }
}
