package com.example.employee.restfulapi.service;

import com.example.employee.restfulapi.entity.Company;
import com.example.employee.restfulapi.entity.Employee;
import com.example.employee.restfulapi.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public List<Employee> listEmployees(Long id) {
        return new ArrayList<>(companyRepository.findOne(id).getEmployeeMap().values());
    }

    @Override
    public List<Company> list() {
        return companyRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        companyRepository.delete(id);
    }

    @Override
    public Company find(Long id) {
        return companyRepository.findOne(id);
    }

    @Override
    public Page<Company> pages(int pageNum, int pagesize) {
        return companyRepository.findAll(new PageRequest(pageNum,pagesize));
    }

    @Override
    public void update(Company employee) {
        companyRepository.save(employee);
    }

    @Override
    public void add(Company employee) {
        companyRepository.save(employee);
    }
}
