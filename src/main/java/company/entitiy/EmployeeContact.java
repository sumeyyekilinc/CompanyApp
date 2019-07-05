package company.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

    @Entity
    @Table(name="EMPLOYEE_CONTACT")
    public class EmployeeContact extends BaseEntity  {

    private String street;
    private String city;
    private String country;
    private String phone;
    private String email;
    private Employee employee;


    public EmployeeContact() {

    }
    @Column(name="STREET")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name="CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name="COUNTRY")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name="PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name="EMAIL")
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
