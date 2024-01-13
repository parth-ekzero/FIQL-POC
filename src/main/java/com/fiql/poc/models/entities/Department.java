package com.fiql.poc.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "departments")
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "code", length = 100, unique = true)
    private String code;

    @Column(name = "name", length = 100, unique = true)
    private String name;

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Department department = (Department) o;

        if (!Objects.equals(departmentId, department.departmentId)) {
            return false;
        }
        if (!Objects.equals(code, department.code)) {
            return false;
        }
        if (!Objects.equals(name, department.name)) {
            return false;
        }
        return Objects.equals(name, department.name);
    }

    @Override
    public int hashCode() {
        int result = departmentId != null ? departmentId.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
