package com.university.repository;

import com.university.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findAll();

    Student save(Student student);

    @Override
    void deleteById(Long studentId);

    void save(Optional<Student> student);
}
