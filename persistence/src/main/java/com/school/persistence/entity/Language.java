package com.school.persistence.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Language {
    private String language;
}
