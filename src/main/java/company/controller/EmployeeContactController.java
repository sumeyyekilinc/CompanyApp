package company.controller;

import company.entitiy.EmployeeContact;

public interface EmployeeContactController extends  BaseController {

    EmployeeContact createNewEmployeeContact(EmployeeContact newEmployeeContact);

}
