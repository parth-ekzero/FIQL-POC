package com.fiql.poc.service;

import com.fiql.poc.mapper.PositionMapper;
import com.fiql.poc.models.entities.Position;
import com.fiql.poc.models.model.PositionModel;
import com.fiql.poc.repository.PositionRepository;
import com.fiql.poc.util.PositionFIQLUtils;
import jakarta.persistence.criteria.JoinType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static io.github.perplexhub.rsql.RSQLJPASupport.toSpecification;

@RequiredArgsConstructor
@Slf4j
@Service
public class PositionService {

    private final PositionRepository positionRepository;

    private final PositionMapper positionMapper;

    public List<PositionModel> searchPositions(final String filter) {
        final Map<String, String> propertyPathMapper = PositionFIQLUtils.getFIQLMappingForPosition();
        final Map<String, JoinType> joinHints = getPositionFIQLJoinHints();
        final List<Position> positionList = positionRepository.findAll(toSpecification(filter, false, propertyPathMapper, joinHints));
        return positionMapper.toDtoList(positionList);
    }

    private Map<String, JoinType> getPositionFIQLJoinHints() {
        return Map.of("role", JoinType.INNER);
    }
}
