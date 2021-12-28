package com.czy.service.impl;

import com.czy.dao.ResumeDao;
import com.czy.domain.Resume;
import com.czy.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    ResumeDao resumeDao;

    @Override
    public Resume showUserResume(Integer userId) {
        return resumeDao.findResumeByUserId(userId);
    }
}
