package com.hgb7725.springboot.cruddemo.service;

import com.hgb7725.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    Employee findById(int id);

    List<Employee> getAllEmployees();

    void deleteById(int id);
}
