package com.assignment.project.service;

import java.util.*;

import com.assignment.project.model.Course;
import com.assignment.project.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student add(Student student);
	
	Student update(Student student);
	
	String delete(Long id);
	
	List<Course> getAllCourses();
}
