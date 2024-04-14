package ru.den_ostap.learning.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "sources")
public class Source {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "url")
    @NotBlank(message = "Field url should not be empty")
    private String url;

    private String title;
    private String description;

    @ManyToOne // Establishing a many-to-one relationship with Course
    @JoinColumn(name = "course_id") // Specifying the foreign key column
    private Course course;
}
