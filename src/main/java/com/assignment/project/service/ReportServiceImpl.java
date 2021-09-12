package com.assignment.project.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.project.model.Course;
import com.assignment.project.model.Student;
import com.assignment.project.repository.CourseRepository;
import com.assignment.project.repository.StudentRepository;

@Service
public class ReportServiceImpl implements IReportService {

	@Autowired
	CourseRepository courseRepo;
	@Autowired
	StudentRepository studentRepo;

	@Override
	public Collection<Student> filterStudent(String courseId) {

		return courseRepo.findById(Long.valueOf(courseId)).get().getStudents();
	}

	@Override
	public Collection<Course> filterCourse(String studentId) {

		return studentRepo.findById(Long.valueOf(studentId)).get().getCourses();
	}

	@Override
	public Collection<Course> filterNonRegisterCourse() {
		return courseRepo.findByStudentsIsEmpty();

	}

	@Override
	public Collection<Student> filterNonRegisterStudent() {

		return studentRepo.findByCoursesIsEmpty();
	}

}
