package com.university.service.impl;

import com.university.entity.Student;
import com.university.repository.StudentRepository;
import com.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long studentId, String surname) {
        Student newStudent = studentRepository.findById(studentId).orElseThrow();
        newStudent.setSurname(surname);
        return studentRepository.save(newStudent);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}