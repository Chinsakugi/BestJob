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

    /**
     *修改简历
     */
    void updateResume(@Param("resume") Resume resume,@Param("updateId")Integer userId);


    /**
     *创建一个空简历 只有id和userId
     */
    void insertResume(@Param("userId") Integer userId);

}
