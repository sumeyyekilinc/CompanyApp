package company.entitiy;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EmployeeProject extends Date{

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Employee employee;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Projects project;

    @OneToMany(mappedBy = "employeeProject")
    private Set<Employee> employees;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Projects projects;


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Projects getProject() {
        return project;
    }

    public void setProject(Projects project) {
        this.project = project;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public EmployeeProject() {

    }

}
