package com.czy.service;

import com.czy.domain.Job;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobService {

    List<Job> findJobList(Integer companyId);

}
