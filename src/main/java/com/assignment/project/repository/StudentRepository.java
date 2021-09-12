package com.assignment.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.project.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByCoursesIsEmpty();
}
 