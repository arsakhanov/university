package com.university.service;

import com.university.entity.Student;

import java.util.List;


public interface StudentService {

    List<Student> getAll();

    Student createStudent(Student student);

    Student updateStudent(Long studentId, Student student);

    void deleteStudent(Long studentId);
}
