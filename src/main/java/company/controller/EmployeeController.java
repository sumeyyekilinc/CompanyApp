package company.controller;

import company.dao.BaseDaoImp;
import company.dao.EmployeeDao;
import company.entitiy.BaseEntity;
import company.entitiy.Employee;

import java.util.Iterator;
import java.util.List;

public class EmployeeController extends BaseDaoImp {

    public static void main(String[] args) {

        EmployeeDao ed = new EmployeeDao();
        Employee e = new Employee();

        e.setFirstName("sumeyye");
        e.setLastName("kilinc");
        ed.save(e);

        System.out.println("************************************");

        List<BaseEntity> emplist = ed.getList(5);
        for (Iterator iterator = emplist.iterator(); iterator.hasNext();){

            Employee employee = (Employee) iterator.next();
            System.out.print("First Name: " + employee.getFirstName());
            System.out.print("  Last Name: " + employee.getLastName());
        }

        System.out.println("************************************");
        ed.delete(e);

        System.out.println("************************************");

    }
}

