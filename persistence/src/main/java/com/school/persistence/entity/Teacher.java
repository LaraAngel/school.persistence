package com.school.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Teacher extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String password;
    private Double salary;

    @ElementCollection//List of languages the teacher can teach
    private Set<Language> languages;

    @ManyToOne//Only one status needed
    private Status status;
}
