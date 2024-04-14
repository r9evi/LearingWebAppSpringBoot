package ru.den_ostap.learning.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;

    @OneToMany(mappedBy = "course")
    private List<Source> sources;
}
