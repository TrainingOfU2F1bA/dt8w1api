package com.example.employee.restfulapi.controller;

import com.example.employee.restfulapi.entity.Employee;
import com.example.employee.restfulapi.service.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(EmployeeController.EMPLOYEES)
public class EmployeeController {

    public static final String EMPLOYEES = "employees";
    public static final String PAGE_PAGE_NUM_PAGE_SIZE_PAGE_SIZE = "employees/page/{pageNum:\\d*}/pageSize/{pageSize:\\d*}";
    public static final String ID = "employees/{id:\\d*}";
    public static final String GENDER = "employees/{gender:female|male}";

    @GetMapping(GENDER)
    public List<Employee> listWithGender(String gender) {
        return null;
    }


    @GetMapping
    public List<Employee> list() {
        return null;
    }


    @DeleteMapping(ID)
    public void delete(Long id) {

    }


    @GetMapping(ID)
    public Employee find(Long id) {
        return null;
    }


    @GetMapping(PAGE_PAGE_NUM_PAGE_SIZE_PAGE_SIZE)
    public Page<Employee> pages(int pageNum, int pageSize) {
        return null;
    }


    @PutMapping
    public void update(@RequestBody Employee employee) {

    }

    @PostMapping
    public void add(@RequestBody Employee employee) {

    }
}
