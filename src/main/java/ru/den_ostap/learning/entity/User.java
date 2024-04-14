package ru.den_ostap.learning.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "username")
    @NotBlank(message = "Field password should not be empty")
    private String username;

    @NotBlank(message = "Field password should not be empty")
    @Column(name = "password")
    private String password;

    @Email(message = "Enter the correct email")
    @NotBlank(message = "Field email should not be empty")
    @Column(name = "email")
    private String email;

    private String role = "ROLE_USER"; // Corrected the field name
}
