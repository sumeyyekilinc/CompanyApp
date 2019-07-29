package company.controller;

import company.dao.EmployeeContactDao;
import company.entitiy.EmployeeContact;
import java.util.List;
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
    public void deleteEmployeeContact(EmployeeContact employeeContact) {
        EmployeeContactDao employeeContactDao = new EmployeeContactDao();

        EmployeeContactController employeeContactController = new EmployeeContactControllerImpl();

        List<EmployeeContact> liste = employeeContactController.getEmployeeContactList(10);
        for (int i = 0 ; i< liste.size();i++){
            employeeContact = liste.get(i);
            if(employeeContact.getCity().equalsIgnoreCase("istanbul"))
            {
                employeeContactDao.delete(employeeContact);
            }
        }
    }

    @Override
    public EmployeeContact updateEmployeeContact(EmployeeContact updateEmployeeContact) {
        EmployeeContactDao employeeContactDao = new EmployeeContactDao();
        EmployeeContactController employeeContactController = new EmployeeContactControllerImpl();
        List<EmployeeContact> liste = employeeContactController.getEmployeeContactList(10);
        if (Objects.nonNull(updateEmployeeContact)) {
            for (int i = 0 ; i< liste.size();i++){
                updateEmployeeContact = liste.get(i);
                if(!updateEmployeeContact.getCountry().equalsIgnoreCase("Turkiye"))
                {
                    updateEmployeeContact.setCountry("Turkiye");
                    employeeContactDao.update(updateEmployeeContact);
                }
            }
            employeeContactDao.update(updateEmployeeContact);
        }else {
            throw new IllegalArgumentException("Guncellenemedi!!! ");
        }

        return updateEmployeeContact;
    }

    @Override
    public List<EmployeeContact> getEmployeeContactList(int limit) {
        EmployeeContactDao employeeContactDao = new EmployeeContactDao();
        List<EmployeeContact> employeeList = employeeContactDao.getList(limit);
        return employeeList;
    }

    @Override
    public void sessionAc() {
        System.out.println("EmplooyeContact için session açıldı.");
    }
}
