package com.czy.service;

import com.czy.domain.Job;
import com.czy.domain.Record;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobService {

    List<Job> findJobList(Integer companyId);

    List<Job> findJobByCompanyNameAndJobCategory(String keyword);

    List<Job> findByMultiCondition(String loc, String search, String time,String money, String experience,String education);

    List<Record> findRecordByUserId(Integer userId);

    void insertRecord(Integer userId, Integer jobId);

    List<Job> findJobByCompany(Integer companyId);

    void insertJob(String jobName, String jobInfo,String jobAddress, String salary, String jobDescription,
                   String jobCategory,String jobRequire,Integer companyId, String postTime);

    void deleteJob(Integer jobId,Integer companyId);

    void updateJob(Integer jobId,String jobName, String jobInfo,String jobAddress,
                   String salary, String jobDescription,
                   String jobCategory,String jobRequire,Integer companyId,
                   String postTime);

    Record findRecordByUserIdAndJobId(Integer userId, Integer jobId);

}
