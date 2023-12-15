package com.school.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@MappedSuperclass
public class User {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private LocalDate dayOfBirth;
    @ManyToOne
    private Role role;
}
