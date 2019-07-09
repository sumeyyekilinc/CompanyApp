package company.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Projects extends Date{
    @Column
    private String projectName;

    @OneToMany(mappedBy = "projects")
    private Set<EmployeeProject> employeeProjects;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Set<EmployeeProject> getEmployeeProjects() {
        return employeeProjects;
    }

    public void setEmployeeProjects(Set<EmployeeProject> employeeProjects) {
        this.employeeProjects = employeeProjects;
    }
}
