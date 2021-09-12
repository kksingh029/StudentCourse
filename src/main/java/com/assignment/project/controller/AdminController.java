package com.assignment.project.controller;

import java.util.Collection;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.project.model.Course;
import com.assignment.project.model.Student;
import com.assignment.project.service.IReportService;

@RestController
public class AdminController {

	IReportService reportService;

	@GetMapping(value = "/report/student/{courseId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Student> generateStudentReport(@PathVariable("courseId") String courseId) {

		return reportService.filterStudent(courseId);
	}

	@GetMapping(value = "/report/course/{studentId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Course> generateCourseReport(@PathVariable("studentId") String studentId) {

		return reportService.filterCourse(studentId);
	}

	@GetMapping(value = "/report/non-register-course", produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Course> generateReportCourse() {

		return reportService.filterNonRegisterCourse();
	}

	@GetMapping(value = "/report/non-register-student", produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Student> generateReportStudent() {

		return reportService.filterNonRegisterStudent();
	}
}
