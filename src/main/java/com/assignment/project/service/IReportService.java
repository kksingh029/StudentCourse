package com.assignment.project.service;

import java.util.Collection;

import com.assignment.project.model.Course;
import com.assignment.project.model.Student;

public interface IReportService {

	Collection<Student> filterStudent(String courseId);

	Collection<Course> filterCourse(String studentId);

	Collection<Course> filterNonRegisterCourse();

	Collection<Student> filterNonRegisterStudent();

}
