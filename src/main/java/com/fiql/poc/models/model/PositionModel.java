package com.fiql.poc.models.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PositionModel implements Serializable {
    private Integer positionId;
    private Integer roleId;
    private String code;
    private String name;
    private String email;

    @Override
    public boolean equals(Object object) {
        if ( this == object ) return true;
        if ( object == null || getClass() != object.getClass() ) return false;
        PositionModel that = (PositionModel) object;
        return Objects.equals(positionId, that.positionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionId);
    }
}