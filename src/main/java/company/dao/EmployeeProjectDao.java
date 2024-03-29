package company.dao;

import company.entitiy.EmployeeProject;
import company.util.SessionUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class EmployeeProjectDao extends BaseDaoImp {

    @Override
    public EmployeeProject find(Long id) {
        Session session = null;
        try {
            session = SessionUtil.getInstance().getSession();
            Query query = session.createQuery("from EmployeeProject s where s.id = :id");
            query.setParameter("id", id);

            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                return null;
            } else {
                return (EmployeeProject) queryList.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
    

    public List<EmployeeProject> getList(int limit) {
        Session session =null;
        List<EmployeeProject> empList;
        try {
            session = SessionUtil.getInstance().getSession();
            Query query = session.createQuery("select emp from EmployeeProject emp");
            empList = query.list();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
        return empList;//Hibernate create query bir tablodan liste getirme
    }
}
