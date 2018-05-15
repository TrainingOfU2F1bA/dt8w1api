package com.example.employee.restfulapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Entity
public class Company {
    @Id
    @GeneratedValue
    private Long id;
    private String companyName;
    private Integer employeesNumber;
    @OneToMany
    @JoinColumn(name="company_id")
    @JsonIgnore
    private Map<Long,Employee> employeeMap=new HashMap<>();

    public Company(String companyName, Integer employeesNumber) {
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public Company() {
    }

    public Map<Long, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<Long, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }
}
