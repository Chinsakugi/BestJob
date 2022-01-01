package com.czy.service;

import com.czy.domain.Company;

import java.util.List;

public interface CompanyService {
    List<Company> findAllCompany();

    void insertCompany(Company company);

    void updateCompany(Company company);

    Company login(String username, String password);

    Company findCompanyById(Integer id);

    Company findCompanyByUsername(String username);
}
