package company.controller;

import company.entitiy.Employee;

import java.util.List;

public interface EmployeeController extends BaseController {

    Employee createNewEmployee(Employee newEmployee);
    void deleteEmployee(Employee employee);
    List<Employee> getEmployeeList(int limit);
    Employee updateEmployee (Employee updateEmployee);
}
