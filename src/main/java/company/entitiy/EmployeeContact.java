package company.entitiy;

import javax.persistence.*;

    @Entity
    public class EmployeeContact extends BaseEntity {

    @Column
    private String street;
    @Column
    private String city;
    @Column
    private String country;
    @Column
    private String phone;
    @Column
    private String email;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Employee employee;


    public EmployeeContact() {

    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
