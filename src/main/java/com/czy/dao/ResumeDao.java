package com.czy.dao;

import com.czy.domain.Resume;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeDao {

    /**
     *根据userId查询简历
     */
    Resume findResumeByUserId(@Param("userId") Integer userId);

}
