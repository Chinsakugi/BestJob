package com.czy.dao;

import com.czy.domain.Company;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyDao {
    /**
     *查询所有公司
     */
    List<Company> findAllCompany();

    /**
     *添加公司
     */
    void insertCompany(Company company);

    /**
     *更新公司信息
     */
    void updateCompany(Company company);

    Company findCompanyByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    Company findCompanyById(@Param("id")Integer id);

    Company findCompanyByUsername(@Param("username")String username);
}
