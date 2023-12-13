package com.school.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public class Role {
    private String roleName;
    private String roleDescription;
}
