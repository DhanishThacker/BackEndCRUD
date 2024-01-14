package org.thacker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thacker.model.SalaryLevel;

@Repository
public interface SalaryLevelRepository extends JpaRepository<SalaryLevel, Long> {
}
