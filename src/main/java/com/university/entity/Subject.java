package com.university.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long id;
    private String name;
}
