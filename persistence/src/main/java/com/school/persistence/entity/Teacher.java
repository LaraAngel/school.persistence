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
    @ElementCollection
    private Set<Language> languages;
}
