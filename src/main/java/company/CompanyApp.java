package company;

import company.controller.*;
import company.entitiy.*;
import java.util.List;
import java.util.Set;

public class CompanyApp {

    public static void main(String[] args) {

        //*********************************************************************
        EmployeeController employeeController = new EmployeeControllerImpl();
        Employee employee = new Employee();
        employee.setFirstName("Sumeyye");
        employee.setLastName("Kılınç");
        employee.setDateOfBirth("01/04/1995");
        employee.setPlaceOfBirth("Ankara");
        employeeController.createNewEmployee(employee);


     /*   EmployeeContact employeeContact = new EmployeeContact();*/

      /*  EmployeeContactController employeeContactController = new EmployeeContactControllerImpl();

        employeeContact.setCity("Ankara");
        employeeContact.setCountry("Turkiye");
        employeeContact.setStreet("1233");
        employeeContact.setEmail("ssasd@sddda.com");
        employeeContact.setPhone("5552555525");
        employeeContactController.createNewEmployeeContact(employeeContact);
*/
        //employee.setEmployeeContact((Set<EmployeeContact>) employeeContact);

       // employeeController.deleteEmployee(employee);
       // employeeController.updateEmployee(employee);
        employeListesi();

        //**********************************************************************

/*       EmployeeContactController employeeContactController = new EmployeeContactControllerImpl();

        EmployeeContact employeeContact = new EmployeeContact();
        employeeContact.setCity("Ankara");
        employeeContact.setCountry("Turkiye");
        employeeContact.setStreet("1233");
        employeeContact.setEmail("ssasd@sddda.com");
        employeeContact.setPhone("5552555525");
        employeeContactController.createNewEmployeeContact(employeeContact);*/
       // employeeContactController.deleteEmployeeContact(employeeContact);

      //  employeeContactListesi();

        //**********************************************************************
/*        EmployeeProjectController employeeProjectController = new EmployeeProjectControllerImpl();
        EmployeeProject employeeProject = new EmployeeProject();
        employeeProject.setStartDate("01/04/2018");
        employeeProject.setEndDate("08/06/2019");
        employeeProjectController.createNewEmployeeProject(employeeProject);*/

       // employeeProjectController.deleteEmployeeProject(employeeProject);

      /*
        OrgRolesController orgRolesController = new OrgRolesControllerImpl();
        OrgStructureController orgStructureController = new OrgStructureControllerImpl();
        ProjectController projectController = new ProjectControllerImpl();


        OrgRoles orgRoles = new OrgRoles();
        orgRoles.setTitle("Developer");
        OrgStructure orgStructure = new OrgStructure();
        Projects projects = new Projects();
        employeeController.createNewEmployee(employee);

        orgRolesController.createNewOrgRoles(orgRoles);

        orgStructureController.createNewOrgStructure(orgStructure);
        projectController.createNewProjects(projects);
        System.out.println("işlem sonlandı");*/
    }

    public static void employeListesi(){
        EmployeeController employeeController = new EmployeeControllerImpl();
        List<Employee> liste = employeeController.getEmployeeList(5);

        System.out.println("Liste Eleman Sayısı  : "+ liste.size());

        for (int i = 0 ; i< liste.size();i++){
            Employee employee = liste.get(i);
            System.out.println("Adı/Soyadı : "+ employee.getFirstName()+" "+employee.getLastName());
            System.out.println(employee.getEmployeeContact());
        }

        for (Employee employee : liste){
            if (employee.getLastName().equalsIgnoreCase("epLatForm")){
                System.out.println("forEach : Doğum Yeri : "+employee.getPlaceOfBirth());
            }
        }
    }

    public static void employeeContactListesi (){
        EmployeeContactController employeeContactController = new EmployeeContactControllerImpl();
        List<EmployeeContact> liste = employeeContactController.getEmployeeContactList(10);

        for(EmployeeContact employeeContact : liste)
        {
            System.out.println("Adres : "+employeeContact.getCity()+" "+employeeContact.getEmail());
        }
    }
}