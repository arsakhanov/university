package com.university.service;

import com.university.entity.Subject;

import java.util.List;


public interface SubjectService {

    List<Subject> getAll();

    Subject createSubject(Subject subject);

    Subject updateSubject(Long subjectId, Subject subject);

    void deleteSubject(Long subjectId);

}
