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

    /**
     *插入投递数据
     */
    void insertRecord(@Param("userId") Integer userId, @Param("jobId") Integer jobId);

    void insertJob(@Param("jobName") String jobName, @Param("jobInfo")String jobInfo,@Param("jobAddress") String jobAddress,
                   @Param("salary") String salary, @Param("jobDescription")String jobDescription,
                   @Param("jobCategory")String jobCategory,@Param("jobRequire") String jobRequire,@Param("companyId") Integer companyId,
                   @Param("postTime") String postTime);

    void deleteJob(@Param("jobId") Integer jobId, @Param("companyId")Integer companyId);

    void updateRecord();
}
