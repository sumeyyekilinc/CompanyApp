package company.controller;

import company.dao.EmployeeProjectDao;
import company.entitiy.EmployeeProject;

public class EmployeeProjectControllerImpl implements EmployeeProjectController {
    @Override
    public EmployeeProject createNewEmployeeProject(EmployeeProject newEmployeeProject) {
        EmployeeProjectDao employeeProjectDao = new EmployeeProjectDao();


        employeeProjectDao.save(newEmployeeProject);
        return newEmployeeProject;
    }

    @Override
    public void sessionAc() {

    }
}
