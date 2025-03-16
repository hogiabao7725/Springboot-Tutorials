package com.hgb7725.cruddemo;

import com.hgb7725.cruddemo.dao.StudentDAO;
import com.hgb7725.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			// createStudent(studentDAO);

			// createMultipleStudents(studentDAO);

			// readStudents(studentDAO);

			// queryForStudents(studentDAO);

			queryForStudentsByLastName(studentDAO);

		};
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("a");
		students.forEach(System.out::println);
	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of Students
		List<Student> students = studentDAO.findAll();
		// display list
		for(Student student : students) {
			System.out.println(student);
		}
	}

	private void readStudents(StudentDAO studentDAO) {
		// retrieve student based on the id: primary key
		System.out.println("Retrieving students...");
		Student student1 = studentDAO.findById(2);
		Student student2 = studentDAO.findById(5);
		Student student3 = studentDAO.findById(6);

		// display student
		System.out.println("Display students from retrieve ...");
		System.out.println(student1 + "\n" + student2 + "\n" + student3);

	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// create
		System.out.println("Create 3 students: ");
		Student student1 = new Student("John", "Doe", "john.doe@gmail.com");
		Student student2 = new Student("Mary", "Ozawa", "mary.ozawa@gmail.com");
		Student student3 = new Student("Lucy", "Smith", "lucy.smith@gmail.com");

		// save
		System.out.println("Saving 3  students: ");
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
	}

	private void createStudent(StudentDAO studentDAO) {
		// create
		System.out.println("Creating a new student: ...");
		Student student = new Student("Hoang", "Le Trong", "letronghoang@gmail.com");

		// save
		System.out.println("Saving student: ...");
		studentDAO.save(student);

		// display
		System.out.println("Saved student. Generated id: " + student.getId());

	}
}
