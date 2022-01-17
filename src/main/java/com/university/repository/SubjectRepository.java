package com.university.repository;

import com.university.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

    List<Subject> findAll();

    @Query("select s from Subject s where s.name = ?1")
    Subject findByName(String name);

    Subject save(Subject subject);

    @Override
    void deleteById(Long subjectId);

}
