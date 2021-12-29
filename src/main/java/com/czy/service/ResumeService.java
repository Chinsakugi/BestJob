package com.czy.service;

import com.czy.domain.Resume;

public interface ResumeService {

    Resume showUserResume(Integer userId);

    void updateResume(Resume resume,Integer userId);

    void insertResume(Integer userId);

}
