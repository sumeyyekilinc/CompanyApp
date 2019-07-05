package company.dao;

import company.entitiy.BaseEntity;
import company.entitiy.Employee;
import company.util.SessionUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDao {
    public List<Employee> getEmployeeList() {

        Session session = null;
        List<Employee> empList = null;
        try {
            session = SessionUtil.getSession();
            String queryStr = "select emp from Employee emp";
            Query query = session.createQuery(queryStr);
            empList = query.list();
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if(session != null) session.close();
            } catch(Exception ex) {}
        }
        return empList;
    }
    public BaseEntity getEmployeeById(Long id){

        Session session = null;
        BaseEntity emp = null;
        try {
            session = SessionUtil.getSession();
            String queryStr = "select emp from Employee emp";
            emp = (BaseEntity) session.get(BaseEntity.class, id);

        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
        return emp;
    }

    public void insertEmployee(Employee emp) {

        Session session = null;
        Transaction transaction = null;
        try {
            session = SessionUtil.getSession();
            transaction = session.beginTransaction();
            session.save(emp);
            System.out.println("inserted employee: "+emp.getFirstName());
            transaction.commit();
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
            if(transaction != null) transaction.rollback();
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
    }

    public void deleteEmployee(Employee emp) {

        Session session = null;
        Transaction transaction = null;
        try {
            session = SessionUtil.getSession();
            transaction = session.beginTransaction();
            session.delete(emp);
            transaction.commit();
            System.out.println("deleted employee: "+emp.getFirstName());
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
            if(transaction != null) transaction.rollback();
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
    }

}
