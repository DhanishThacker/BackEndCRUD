package org.thacker.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.thacker.model.Department;
import org.thacker.model.SalaryLevel;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeDTO {

    private String name;
    private String designation;
    private Long managerId;
    private Department department;
    private SalaryLevel salaryLevel;
    private Long salary;

}
