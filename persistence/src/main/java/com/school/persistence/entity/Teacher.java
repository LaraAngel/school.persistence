package com.school.persistence.entity;

import com.school.persistence.enums.EmployeeStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Teacher extends User{

    private Double salary;
    private EmployeeStatus status;

    @ManyToMany
    private Set<Language> languages;
}
