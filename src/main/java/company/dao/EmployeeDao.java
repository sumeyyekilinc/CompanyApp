package company.dao;

import company.entitiy.BaseEntity;
import company.entitiy.Employee;
import company.util.SessionUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;

public class EmployeeDao extends BaseDaoImp {

    @Override
    public Employee find(Long id) {
        Session session = null;
        try {
            session = SessionUtil.getInstance().getSession();
            Query query = session.createQuery("from Employee s where s.id = :id");
            query.setParameter("id", id);


            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                return null;
            } else {
                return (Employee) queryList.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }


    public List<Employee> getList(int limit) {
        Session session =null;
        List<Employee> empList;
        try {
            session = SessionUtil.getInstance().getSession();
            Query query = session.createQuery("select emp from Employee emp");
            empList = query.setMaxResults(limit).list();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
        return empList;//Hibernate create query bir tablodan liste getirme
    }
}



