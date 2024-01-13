package com.fiql.poc.mapper;

import com.fiql.poc.models.entities.Position;
import com.fiql.poc.models.model.PositionModel;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PositionMapper {

    @Mapping(target = "roleId", source = "role.roleId")
    PositionModel toDto(Position position);


    List<PositionModel> toDtoList(List<Position> positionList);


}