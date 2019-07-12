package company.controller;

import company.entitiy.Employee;

import java.util.List;

public interface EmployeeController extends BaseController {

    Employee createNewEmployee(Employee newEmployee);

    List<Employee> getEmployeeList(int limit);
}
