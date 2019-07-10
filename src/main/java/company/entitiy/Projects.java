package company.entitiy;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Projects extends Date{
    @Column
    private String projectName;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private EmployeeProject employeeProjects;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public EmployeeProject getEmployeeProjects() {
        return employeeProjects;
    }

    public void setEmployeeProjects(EmployeeProject employeeProjects) {
        this.employeeProjects = employeeProjects;
    }

}
