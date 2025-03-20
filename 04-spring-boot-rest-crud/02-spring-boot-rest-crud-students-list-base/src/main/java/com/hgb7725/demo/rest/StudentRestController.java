package com.hgb7725.demo.rest;

import com.hgb7725.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Messi", "Lionel"));
        theStudents.add(new Student("Mike", "Jakson"));
        theStudents.add(new Student("Maria", "Ozawa"));
        return theStudents;
    }
}
