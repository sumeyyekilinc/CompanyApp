package company.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity

public class OrgStructure extends BaseEntity  {
    @Column
    private String unitName;
    @Column
    private String unitHead;
    @OneToMany(mappedBy = "orgStructure")
    private Set<Employee> employees;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitHead() {
        return unitHead;
    }

    public void setUnitHead(String unitHead) {
        this.unitHead = unitHead;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
