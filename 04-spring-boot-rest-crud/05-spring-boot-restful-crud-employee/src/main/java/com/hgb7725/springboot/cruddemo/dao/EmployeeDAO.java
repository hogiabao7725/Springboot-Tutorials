package com.hgb7725.springboot.cruddemo.dao;

import com.hgb7725.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    Employee save(Employee employee);

    Employee findById(int id);

    List<Employee> findAll();

    void deleteById(int id);

}
