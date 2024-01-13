package com.fiql.poc.repository;

import com.fiql.poc.models.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartmentRepository
    extends
        JpaRepository<Department, Integer>, JpaSpecificationExecutor<Department> {

}
