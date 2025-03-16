package com.hgb7725.cruddemo.dao;

import com.hgb7725.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

}
