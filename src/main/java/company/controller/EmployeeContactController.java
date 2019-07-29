package company.controller;

import company.entitiy.EmployeeContact;

import java.util.List;

public interface EmployeeContactController extends  BaseController {

    EmployeeContact createNewEmployeeContact(EmployeeContact newEmployeeContact);
    void deleteEmployeeContact(EmployeeContact employeeContact);
    EmployeeContact updateEmployeeContact (EmployeeContact updateEmployeeContact);
    List<EmployeeContact> getEmployeeContactList(int limit);
}
