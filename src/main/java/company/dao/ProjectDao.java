package company.dao;

import company.entitiy.BaseEntity;
import company.entitiy.Projects;
import company.util.SessionUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;

public class ProjectDao extends BaseDaoImp {
    @Override
    public Projects find(Long id) {
        Session session = null;
        try {
            session = SessionUtil.getInstance().getSession();
            Query query = session.createQuery("from Projects s where s.id = :id");
            query.setParameter("id", id);

            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                return null;
            } else {
                return (Projects) queryList.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }


    public List<ProjectDao> getList(int limit) {
        Session session =null;
        List<ProjectDao> empList;
        try {
            session = SessionUtil.getInstance().getSession();
            Query query = session.createQuery("select emp from Project emp");
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
