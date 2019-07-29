package company.entitiy;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee extends BaseEntity {

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String placeOfBirth;
    @Column
    private String dateOfBirth;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private OrgRoles orgRoles;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private OrgStructure orgStructure;

    @OneToMany(mappedBy = "employee")
    private Set<EmployeeContact> employeeContact;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private EmployeeProject employeeProject;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String placeOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.placeOfBirth = placeOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public OrgRoles getOrgRoles() {
        return orgRoles;
    }
    public void setOrgRoles(OrgRoles orgRoles) {
        this.orgRoles = orgRoles;
    }
    public OrgStructure getOrgStructure() {
        return orgStructure;
    }
    public void setOrgStructure(OrgStructure orgStructure) {
        this.orgStructure = orgStructure;
    }
    public Set<EmployeeContact> getEmployeeContact() {
        return employeeContact;
    }
    public void setEmployeeContact(Set<EmployeeContact> employeeContact) {
        this.employeeContact = employeeContact;
    }
    public EmployeeProject getEmployeeProject() {
        return employeeProject;
    }
    public void setEmployeeProject(EmployeeProject employeeProject) {
        this.employeeProject = employeeProject;
    }
}
