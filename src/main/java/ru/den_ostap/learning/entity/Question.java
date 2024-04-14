package ru.den_ostap.learning.entity;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String theme;
    private byte difficulty;
    private String question;
    private String correctAnswer;

}
