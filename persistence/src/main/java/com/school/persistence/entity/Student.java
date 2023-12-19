package com.school.persistence.entity;

import com.school.persistence.enums.StudentStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Student extends User {
    private String code;
    private String picture;
    private StudentStatus status;
}
