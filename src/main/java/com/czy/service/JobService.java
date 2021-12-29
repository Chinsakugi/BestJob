package com.czy.service;

import com.czy.domain.Job;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobService {

    List<Job> findJobList(Integer companyId);

    List<Job> findJobByCompanyNameAndJobCategory(String keyword);

    List<Job> findByMultiCondition(String loc, String search, String time,String money, String experience,String education);

}
