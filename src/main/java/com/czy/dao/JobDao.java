package com.czy.dao;

import com.czy.domain.Job;
import com.czy.domain.Record;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobDao {

    /**
     *根据公司查询工作
     */
    List<Job> findJobByCompany(@Param("companyId") Integer companyId);

    List<Job> findAllJob();

    List<Job> findJobByCompanyNameAndJobCategory(@Param("keyword") String keyword);

    List<Job> findByMultiCondition(@Param("loc") String loc, @Param("search") String search, @Param("time") String time,
                                   @Param("money") String money, @Param("experience") String experience,@Param("education") String education);

    List<Record> findRecordByUserId(@Param("userId") Integer userId);
}
