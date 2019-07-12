package company;


import company.controller.*;
import company.entitiy.*;

import java.util.List;

public class CompanyApp {


    public static void main(String[] args) {

//        employeListesi();

        EmployeeController employeeController = new EmployeeControllerImpl();

        Employee employee = new Employee();
        employee.setFirstName("Bhmet");
        employee.setLastName("Hakan");
        employee.setDateOfBirth("01/01/1985");
        employee.setPlaceOfBirth("İstanbul");
        employeeController.createNewEmployee(employee);

/*        EmployeeController employeeController = new EmployeeControllerImpl();
        EmployeeContactController employeeContactController = new EmployeeContactControllerImpl();
        EmployeeProjectController employeeProjectController = new EmployeeProjectControllerImpl();
        OrgRolesController orgRolesController = new OrgRolesControllerImpl();
        OrgStructureController orgStructureController = new OrgStructureControllerImpl();
        ProjectController projectController = new ProjectControllerImpl();


        Employee employee = new Employee();
        employee.setFirstName("Arif");
        employee.setLastName("Aydogan");
        employee.setDateOfBirth("01/01/1991");
        employee.setPlaceOfBirth("Ankara");


        EmployeeContact employeeContact = new EmployeeContact();
        employeeContact.setCity("Ankara");
        employeeContact.setCountry("Turkiye");
        employeeContact.setStreet("1233");
        employeeContact.setEmail("ssasd@sddda.com");
        employeeContact.setPhone("5552555525");


        EmployeeProject employeeProject = new EmployeeProject();
        employeeProject.setStartDate("01/04/2018");
        employeeProject.setEndDate("08/06/2019");


        OrgRoles orgRoles = new OrgRoles();
        orgRoles.setTitle("Developer");


        OrgStructure orgStructure = new OrgStructure();

        Projects projects = new Projects();


        employeeController.createNewEmployee(employee);
        employeeContactController.createNewEmployeeContact(employeeContact);
        employeeProjectController.createNewEmployeeProject(employeeProject);
        orgRolesController.createNewOrgRoles(orgRoles);
        orgStructureController.createNewOrgStructure(orgStructure);
        projectController.createNewProjects(projects);


        System.out.println("işlem sonlandı");*/

    }

    public static void employeListesi(){
        EmployeeController employeeController = new EmployeeControllerImpl();
        List<Employee> liste = employeeController.getEmployeeList(10);

        System.out.println("Liste Eleman Sayısı  : "+ liste.size());

        for (int i = 0 ; i< liste.size();i++){
            Employee employee = liste.get(i);
            System.out.println("Soyadı : "+employee.getLastName());
        }

        for (Employee employee : liste){
            if (employee.getLastName().equalsIgnoreCase("epLatForm")){
                System.out.println("forEach : Doğum Yeri : "+employee.getPlaceOfBirth());
            }

        }

    }

}
