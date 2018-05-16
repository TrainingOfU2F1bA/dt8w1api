package com.example.employee.restfulapi.controller;

import com.example.employee.restfulapi.entity.Company;
import com.example.employee.restfulapi.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(CompanyController.COMPANIES)
public class CompanyController {

    public static final String COMPANIES = "companies";
    public static final String COMPANIES_ID_EMPLOYEES = "companies/{id:\\d*}/employees";
    public static final String COMPANIES_ID = "companies/{id:\\d*}";
    public static final String COMPANIES_PAGE_PAGE_NUM_PAGE_SIZE_PAGE_SIZE = "companies/page/{pageNum}/pageSize/{pageSize}";

    @GetMapping(COMPANIES_ID_EMPLOYEES)
    public List<Employee> listEmployees(@PathVariable Long id) {
        return null;
    }


    @GetMapping(COMPANIES)
    public List<Company> list() {
        return null;
    }


    @DeleteMapping(COMPANIES_ID)
    public void delete(@PathVariable Long id) {

    }


    @GetMapping(COMPANIES_ID)
    public Company find(@PathVariable Long id) {
        return null;
    }


    @GetMapping(COMPANIES_PAGE_PAGE_NUM_PAGE_SIZE_PAGE_SIZE)
    public Object pages(@PathVariable int pageNum,@PathVariable int pageSize) {
        return null;
    }


    @PutMapping(COMPANIES)
    public void update(@RequestBody Company company) {

    }


    @PostMapping(COMPANIES)
    public void add(@RequestBody Company company) {

    }
}
