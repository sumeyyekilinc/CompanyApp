package company.controller;

import company.dao.EmployeeDao;
import company.entitiy.Employee;

import java.util.List;
import java.util.Objects;

public class EmployeeControllerImpl implements EmployeeController {


    public Employee createNewEmployee(Employee newEmployee) {

        EmployeeDao ed = new EmployeeDao();

        if (Objects.nonNull(newEmployee)) {
            if (newEmployee.getFirstName().trim().startsWith("A")) {
                ed.save(newEmployee);
            }else {
                System.out.println("İsim A ile başlamadığı için kaydedilmedi");
                throw new IllegalArgumentException("HATALI KAYIT A ILE BASLAMIYOR ");
            }



        }

        /*

        List<BaseEntity> emplist = ed.getList(5);
        for (Iterator iterator = emplist.iterator(); iterator.hasNext();){

            Employee employee = (Employee) iterator.next();
            System.out.print("First Name: " + employee.getFirstName());
            System.out.print("  Last Name: " + employee.getLastName());
        }

        ed.delete(e);
    */
        return newEmployee;
    }

    @Override
    public List<Employee> getEmployeeList(int limit) {
        EmployeeDao employeeDao = new EmployeeDao();
        List<Employee> employeeList = employeeDao.getList(limit);
        return employeeList;
    }



    public void sessionAc() {
        System.out.println("Emplooye için session açıldı.");
    }
}

