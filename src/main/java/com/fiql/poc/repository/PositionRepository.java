package com.fiql.poc.repository;

import com.fiql.poc.models.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer>, JpaSpecificationExecutor<Position> {

}