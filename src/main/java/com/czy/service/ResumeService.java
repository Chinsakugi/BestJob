package com.czy.service;

import com.czy.domain.Resume;

import java.util.List;

public interface ResumeService {

    Resume showUserResume(Integer userId);

    void updateResume(Resume resume,Integer userId);

    void insertResume(Resume resume);

    List<Resume> showResumeByJobId(Integer companyId, Integer jobId);

}
