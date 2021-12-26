package com.czy.dao;

import com.czy.domain.Job;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobDao {

    /**
     *根据公司查询工作
     */
    List<Job> findJobByCompany(@Param("companyId") Integer companyId);
}
