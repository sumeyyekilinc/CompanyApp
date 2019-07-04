package company.entitiy;

public class Employee extends BaseEntity {

    private String firstName;
    private String lastName;
    private String placeOfBirth;
    private String dateOfBirth;
    private OrgRoles orgRoles;
    private OrgStructure orgStructure;


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



}
