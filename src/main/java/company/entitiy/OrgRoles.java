package company.entitiy;

import javax.persistence.*;
import java.util.Set;

@Entity
public class OrgRoles extends BaseEntity  {

    @Column
    private String title;

    @OneToMany(mappedBy = "orgRoles")
    private Set<Employee> employees;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
