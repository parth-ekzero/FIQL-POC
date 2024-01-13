package com.fiql.poc.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    @Column(name = "code", length = 100)
    private String code;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "description", length = 256)
    private String description;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RoleDepartmentMap> roleDepartmentList;

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Role role = (Role) o;

        if (!roleId.equals(role.roleId)) {
            return false;
        }
        if (!Objects.equals(name, role.name)) {
            return false;
        }
        return Objects.equals(name, role.name);
    }

    @Override
    public int hashCode() {
        int result = roleId.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}