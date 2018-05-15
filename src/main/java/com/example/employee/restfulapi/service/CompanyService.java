package com.example.employee.restfulapi.service;

import com.example.employee.restfulapi.entity.Company;
import com.example.employee.restfulapi.entity.Employee;

import java.util.List;

public interface CompanyService extends BaseService<Company>{
    public List<Employee> listEmployees(Long id);
}
