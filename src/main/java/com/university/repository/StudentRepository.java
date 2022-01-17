package com.university.repository;

import com.university.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAll();

    @Query("select s from Student s where s.surname = ?1")
    Student findBySurname(String surname);

    Student save(Student student);

    @Override
    void deleteById(Long studentId);

}
