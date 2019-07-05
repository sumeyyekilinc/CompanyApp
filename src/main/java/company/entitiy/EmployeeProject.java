package company.entitiy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_PROJECT")
public class EmployeeProject extends Date{

    private Employee employee;
    private Projects project;

    public EmployeeProject() {

    }

}
