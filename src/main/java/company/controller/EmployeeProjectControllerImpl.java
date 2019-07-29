package company.controller;

import company.dao.EmployeeDao;
import company.dao.EmployeeProjectDao;
import company.entitiy.Employee;
import company.entitiy.EmployeeProject;

import java.util.List;
import java.util.Objects;

public class EmployeeProjectControllerImpl implements EmployeeProjectController {
    @Override
    public EmployeeProject createNewEmployeeProject(EmployeeProject newEmployeeProject) {
        EmployeeProjectDao employeeProjectDao = new EmployeeProjectDao();


        employeeProjectDao.save(newEmployeeProject);
        return newEmployeeProject;
    }

    @Override

    public void deleteEmployeeProject(EmployeeProject employeeProject) {
        EmployeeProjectDao employeeProjectDao = new EmployeeProjectDao();

        EmployeeProjectController employeeProjectController= new EmployeeProjectControllerImpl();
        List<EmployeeProject> liste = employeeProjectController.getEmployeeProjectList(10);
        for (int i = 0 ; i< liste.size();i++){
            employeeProject = liste.get(i);
            employeeProjectDao.delete(employeeProject);
        }
    }

    @Override
    public List<EmployeeProject> getEmployeeProjectList(int limit) {
        EmployeeProjectDao employeeProjectDao = new EmployeeProjectDao();
        List<EmployeeProject> employeeProjectList = employeeProjectDao.getList(limit);
        return employeeProjectList;
    }

    @Override

    public Employee updateEmployee(Employee updateEmployee) {
        EmployeeProjectDao employeeProjectDao = new EmployeeProjectDao();
        return null;
    }

    @Override
    public void sessionAc() {

    }
}
