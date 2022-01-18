package com.university.service.impl;

import com.university.entity.CourseRating;
import com.university.entity.Student;
import com.university.entity.Subject;
import com.university.repository.RatingRepository;
import com.university.repository.StudentRepository;
import com.university.repository.SubjectRepository;
import com.university.service.RatingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    final RatingRepository ratingRepository;
    final StudentRepository studentRepository;
    final SubjectRepository subjectRepository;

    public RatingServiceImpl(RatingRepository ratingRepository, StudentRepository studentRepository, SubjectRepository subjectRepository) {
        this.ratingRepository = ratingRepository;
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
    }

    @Override
    public void addRating(String surname, String name, int rating) {
        Student student = studentRepository.findBySurname(surname);
        Subject subject = subjectRepository.findByName(name);
        CourseRating courseRating = new CourseRating();
        courseRating.setStudent(student);
        courseRating.setSubject(subject);
        courseRating.setRating(rating);
        ratingRepository.save(courseRating);
    }

    @Override
    public List<CourseRating> getAll() {
        return ratingRepository.findAll();
    }
}
