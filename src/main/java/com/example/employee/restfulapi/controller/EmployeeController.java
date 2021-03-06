package com.example.employee.restfulapi.controller;

import com.example.employee.restfulapi.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(EmployeeController.EMPLOYEES)
public class EmployeeController {

    public static final String EMPLOYEES = "employees";
    public static final String PAGE_PAGE_NUM_PAGE_SIZE_PAGE_SIZE = "employees/page/{pageNum:\\d*}/pageSize/{pageSize:\\d*}";
    public static final String ID = "employees/{id:\\d*}";
    public static final String GENDER = "employees/{gender:female|male}";

    @GetMapping(GENDER)
    public List<Employee> listWithGender(@PathVariable String gender) {
        return null;
    }


    @GetMapping(EMPLOYEES)
    public List<Employee> list() {
        return null;
    }


    @DeleteMapping(ID)
    public void delete(@PathVariable Long id) {

    }


    @GetMapping(ID)
    public Employee find(@PathVariable Long id) {
        return null;
    }


    @GetMapping(PAGE_PAGE_NUM_PAGE_SIZE_PAGE_SIZE)
    public Object pages(@PathVariable int pageNum,@PathVariable int pageSize) {
        return null;
    }


    @PutMapping(EMPLOYEES)
    public void update(@RequestBody Employee employee) {

    }

    @PostMapping(EMPLOYEES)
    public void add(@RequestBody Employee employee) {

    }
}
