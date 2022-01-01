package com.czy.service.impl;

import com.czy.dao.ResumeDao;
import com.czy.domain.Resume;
import com.czy.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    ResumeDao resumeDao;

    @Override
    public Resume showUserResume(Integer userId) {
        return resumeDao.findResumeByUserId(userId);
    }

    @Override
    public void updateResume(Resume resume,Integer userId) {
        resumeDao.updateResume(resume,userId);
    }

    @Override
    public void insertResume(Resume resume) {
        resumeDao.insertResume(resume);
    }

    @Override
    public List<Resume> showResumeByJobId(Integer companyId, Integer jobId) {
        return resumeDao.showResumeByJobId(companyId,jobId);
    }
}
