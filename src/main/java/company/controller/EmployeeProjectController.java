package company.controller;

import company.entitiy.Employee;
import company.entitiy.EmployeeProject;

import java.util.List;

public interface EmployeeProjectController extends BaseController {

    EmployeeProject createNewEmployeeProject (EmployeeProject newEmployeeProject);
    void deleteEmployeeProject(EmployeeProject employeeProject);
    List<EmployeeProject> getEmployeeProjectList(int limit);
    public Employee updateEmployee(Employee updateEmployee);
}
