package company.controller;

import company.dao.EmployeeContactDao;
import company.entitiy.EmployeeContact;

import java.util.Objects;

public class EmployeeContactControllerImpl implements EmployeeContactController {
    @Override
    public EmployeeContact createNewEmployeeContact(EmployeeContact newEmployeeContact) {
        EmployeeContactDao employeeContactDao = new EmployeeContactDao();

        if (Objects.nonNull(newEmployeeContact)) {
            if (newEmployeeContact.getCity().equalsIgnoreCase("Ankara")){
            newEmployeeContact.setCity("Istanbul");
            }
            employeeContactDao.save(newEmployeeContact);
        }
        return newEmployeeContact;
    }
    @Override
    public void sessionAc() {
        System.out.println("EmplooyeContact için session açıldı.");
    }
}
