package org.thacker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thacker.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
