package org.thacker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salary_level")
public class SalaryLevel {

    @Id
    @GeneratedValue
    private Long id;
    private Long minSalary;
    private Long maxSalary;

    public SalaryLevel(Long id, Long minSalary, Long maxSalary) {
        this.id = id;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public SalaryLevel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Long minSalary) {
        this.minSalary = minSalary;
    }

    public Long getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Long maxSalary) {
        this.maxSalary = maxSalary;
    }
}
