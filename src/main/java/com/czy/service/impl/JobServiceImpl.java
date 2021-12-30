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
        return jobDao.findByMultiCondition(loc,search,time,money,experience,education);
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
}
