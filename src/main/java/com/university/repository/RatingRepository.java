package com.university.repository;

import com.university.entity.CourseRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<CourseRating, Long> {

    List<CourseRating> findAll();
}
