package com.fiql.poc.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "role_department_map")
public class RoleDepartmentMap implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_department_map_id", nullable = false)
    private Integer roleDepartmentMapId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "role_id", insertable = false, updatable = false)
    private Integer roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "department_id", insertable = false, updatable = false)
    private Long departmentId;

    @Column(name = "is_primary_department")
    private Boolean isPrimaryDepartment;

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final RoleDepartmentMap that = (RoleDepartmentMap) o;

        if (!Objects.equals(roleDepartmentMapId, that.roleDepartmentMapId)) {
            return false;
        }
        if (!Objects.equals(role, that.role)) {
            return false;
        }
        return Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        int result = roleDepartmentMapId != null ? roleDepartmentMapId.hashCode() : 0;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }
}