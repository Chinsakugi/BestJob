package com.czy.service.impl;

import com.czy.dao.JobDao;
import com.czy.domain.Job;
import com.czy.domain.Record;
import com.czy.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    JobDao jobDao;

    @Override
    public List<Job> findJobList(Integer companyId) {
        return jobDao.findJobByCompany(companyId);
    }

    @Override
    public List<Job> findJobByCompanyNameAndJobCategory(String keyword) {
        return jobDao.findJobByCompanyNameAndJobCategory(keyword);
    }

    @Override
    public List<Job> findByMultiCondition(String loc, String search, String time, String money, String experience, String education) {
        Integer leftYear = null , rightYear = null;  //工作经验
        if (experience!=null){
            if ("1年以下".equals(experience)) {
                rightYear = 1;
            } else if ("1-3年".equals(experience)){
                leftYear = 1;
                rightYear = 4;
            }else {
                leftYear = 3;
            }
        }

        Integer postTime = null;
        if (time!=null){
            if ("一天以内".equals(time)){
                postTime = 1;
            }else if ("三天以内".equals(time)){
                postTime = 3;
            }else if("七天以内".equals(time)){
                postTime = 7;
            }else if ("十五天以内".equals(time)){
                postTime = 15;
            }else if("一个月以内".equals(time)) {
                postTime = 31;
            }
        }

        Integer leftSalary = null, rightSalary = null;
        if (money!=null){
            if ("3000元以下".equals(money)){
                rightSalary = 3000;
            }else if ("3000-8000元".equals(money)){
                leftSalary = 3000;
                rightSalary = 8000;
            }else if ("8000-20000元".equals(money)){
                leftSalary = 8000;
                rightSalary = 20000;
            }else {
                leftSalary = 20000;
            }
        }

        return jobDao.findByMultiCondition(loc,search,postTime,leftSalary,rightSalary,leftYear,rightYear,education);
    }

    @Override
    public List<Record> findRecordByUserId(Integer userId) {
        return jobDao.findRecordByUserId(userId);
    }

    @Override
    public void insertRecord(Integer userId, Integer jobId) {
        jobDao.insertRecord(userId,jobId);
    }

    @Override
    public List<Job> findJobByCompany(Integer companyId) {
        return jobDao.findJobByCompany(companyId);
    }

    @Override
    public void insertJob(String jobName, String jobInfo, String jobAddress, String salary, String jobDescription, String jobCategory, String jobRequire, Integer companyId, String postTime) {
        jobDao.insertJob(jobName,jobInfo,jobAddress,salary,jobDescription,jobCategory,jobRequire,companyId,postTime);
    }

    @Override
    public void deleteJob(Integer jobId,Integer companyId) {
        jobDao.deleteJob(jobId,companyId);
    }

    @Override
    public void updateJob(Integer jobId, String jobName, String jobInfo, String jobAddress, String salary, String jobDescription, String jobCategory, String jobRequire, Integer companyId, String postTime) {
        jobDao.updateJob(jobId,jobName,jobInfo,jobAddress,salary,jobDescription,jobCategory,jobRequire,
                         companyId,postTime);
    }

    @Override
    public Record findRecordByUserIdAndJobId(Integer userId, Integer jobId) {
        return jobDao.findRecordByUserIdAndJobId(userId,jobId);
    }
}
