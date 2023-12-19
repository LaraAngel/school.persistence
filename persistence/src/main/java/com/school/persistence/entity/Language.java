package com.school.persistence.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Language {
    private String language;
}
