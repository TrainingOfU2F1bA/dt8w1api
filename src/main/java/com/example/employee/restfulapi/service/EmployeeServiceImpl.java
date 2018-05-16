package com.example.employee.restfulapi.service;

import com.example.employee.restfulapi.entity.Company;
import com.example.employee.restfulapi.entity.Employee;
import com.example.employee.restfulapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> listWithGender(String gender) {
        return employeeRepository.findByGender(gender);
    }

    @Override
    public List<Employee> list() {
        return employeeRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        employeeRepository.delete(id);
    }

    @Override
    public Employee find(Long id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public Page<Employee> pages(int pageNum, int pagesize) {
        return employeeRepository.findAll(new PageRequest(pageNum,pagesize));
    }

    @Override
    public void update(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.save(employee);
    }
}
