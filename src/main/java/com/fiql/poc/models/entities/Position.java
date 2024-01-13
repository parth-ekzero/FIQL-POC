package com.fiql.poc.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "positions")
public class Position implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id", nullable = false)
    private Integer positionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "role_id", insertable = false, updatable = false)
    private Integer roleId;

    @Column(name = "code", length = 100)
    private String code;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "email", length = 64)
    private String email;


    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Position position = (Position) o;

        if (!positionId.equals(position.positionId)) {
            return false;
        }
        if (!Objects.equals(name, position.name)) {
            return false;
        }
        return Objects.equals(name, position.name);
    }

    @Override
    public int hashCode() {
        int result = positionId.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}