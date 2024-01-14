package org.thacker.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String designation;
    private Long managerId;
    @ManyToOne
    @JoinColumn(name = "department_id" , referencedColumnName = "id")
    private Department department;
    @ManyToOne
    @JoinColumn(name = "level_id" , referencedColumnName = "id")
    private SalaryLevel level;
    private Long salary;

    public Employee(Long id, String name, String designation, Long managerId, Department department, SalaryLevel level, Long salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.managerId = managerId;
        this.department = department;
        this.level = level;
        this.salary = salary;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public SalaryLevel getLevel() {
        return level;
    }

    public void setLevel(SalaryLevel level) {
        this.level = level;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
