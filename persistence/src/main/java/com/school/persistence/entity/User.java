package com.school.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@MappedSuperclass
public class User {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    @ManyToOne
    private Role role;
}
