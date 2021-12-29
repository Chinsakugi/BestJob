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
}
