package com.czy.service.impl;

import com.czy.dao.CompanyDao;
import com.czy.domain.Company;
import com.czy.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> findAllCompany() {
        return companyDao.findAllCompany();
    }

    @Override
    public void insertCompany(Company company) {
        companyDao.insertCompany(company);
    }

    @Override
    public void updateCompany(Company company) {
        companyDao.updateCompany(company);
    }
}
