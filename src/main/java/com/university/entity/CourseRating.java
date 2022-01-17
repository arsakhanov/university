package com.university.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cource_rating")
@Data
public class CourseRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rating_id")
    private Long ratingId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    Subject subject;

    private int rating;
}
