package com.university.service;

import com.university.entity.CourseRating;

import java.util.List;

public interface RatingService {

    void addRating(String surname, String name, int rating);

    List<CourseRating> getAll();
}
