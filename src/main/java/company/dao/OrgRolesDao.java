package company.dao;

import company.entitiy.BaseEntity;
import company.entitiy.OrgRoles;
import company.util.SessionUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class OrgRolesDao extends BaseDaoImp {

    @Override
    public OrgRoles find(Long id) {
        Session session = null;
        try {
            session = SessionUtil.getInstance().getSession();
            Query query = session.createQuery("from OrgRoles s where s.id = :id");
            query.setParameter("id", id);

            List queryList = query.list();
            if (queryList != null && queryList.isEmpty()) {
                return null;
            } else {
                return (OrgRoles) queryList.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }

    }


    public List<OrgRoles> getList(int limit) {
        Session session =null;
        List<OrgRoles> empList;
        try {
            session = SessionUtil.getInstance().getSession();
            Query query = session.createQuery("select emp from OrgRoles emp");
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
