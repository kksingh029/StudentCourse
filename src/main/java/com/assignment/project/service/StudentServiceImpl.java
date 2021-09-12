package com.assignment.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.project.model.Course;
import com.assignment.project.model.Student;
import com.assignment.project.repository.CourseRepository;
import com.assignment.project.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll(); 
	}
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	@Override
	public Student add(Student newStudent) {		
		return studentRepository.save(newStudent);
	}
	
	@Override
	public String delete(Long id) {
		try {
			studentRepository.deleteById(id);
		}catch(Exception err) {
			return "Failed to delete Student with id" + id;
		}
		return "Deleted Student with id " + id;
	}
	
	@Override
	public Student update(Student student) {
		if(!studentRepository.existsById(student.getId())) {
			return null;
		}
		
		return studentRepository.save(student);
	}
	
}
