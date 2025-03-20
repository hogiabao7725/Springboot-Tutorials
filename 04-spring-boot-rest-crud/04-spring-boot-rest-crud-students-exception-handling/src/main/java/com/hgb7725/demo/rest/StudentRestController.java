package com.hgb7725.demo.rest;

import com.hgb7725.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    private void loadData() {
        this.theStudents = new ArrayList<>();
        theStudents.add(new Student("Messi", "Lionel"));
        theStudents.add(new Student("Mike", "Jakson"));
        theStudents.add(new Student("Maria", "Ozawa"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }

    @GetMapping("/students/{studentID}")
    public Student getStudent(@PathVariable("studentID") int studentIDs) {
        if(studentIDs < 0 || studentIDs >= theStudents.size()) {
            throw new StudentNotFoundException("Student not found: " + studentIDs);
        }

        return theStudents.get(studentIDs);
    }

}
