package com.czy.service.impl;

import com.czy.dao.JobDao;
import com.czy.domain.Job;
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
}
