package com.fiql.poc.repository;

import com.fiql.poc.models.entities.RoleDepartmentMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface RoleDepartmentMapRepository
    extends JpaRepository<RoleDepartmentMap, Integer>, JpaSpecificationExecutor<RoleDepartmentMap> {

}
