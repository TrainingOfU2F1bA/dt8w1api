package com.example.employee.restfulapi.service;

import com.example.employee.restfulapi.entity.Employee;

import java.util.List;

public interface EmployeeService extends BaseService<Employee>{
    public List<Employee> listWithGender(String gender);
}
