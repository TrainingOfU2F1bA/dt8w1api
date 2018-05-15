package com.example.employee.restfulapi.service;

import com.example.employee.restfulapi.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BaseService<T> {
    public List<T> list();
    public void delete(Long id);
    public T find(Long id);
    public Page<T> pages(int pageNum,int pagesize);
    public void update(Employee employee);
    public void add(Employee employee);
}
