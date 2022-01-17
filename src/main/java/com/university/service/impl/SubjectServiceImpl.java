package com.university.service.impl;

import com.university.entity.Student;
import com.university.entity.Subject;
import com.university.repository.SubjectRepository;
import com.university.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject updateSubject(Long subjectId, Subject subject) {
        Subject newSubject = subjectRepository.findById(subjectId).orElseThrow();
        newSubject.setName(subject.getName());
        return subjectRepository.save(newSubject);
    }

    @Override
    public void deleteSubject(Long subjectId) {
        subjectRepository.deleteById(subjectId);
    }

}
