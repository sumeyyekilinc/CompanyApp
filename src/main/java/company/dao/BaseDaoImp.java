package company.dao;

import company.entitiy.BaseEntity;
import company.util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BaseDaoImp implements BaseDao {

    public BaseEntity find(Long id) {
        return null;
    }

    public void delete(BaseEntity entity) {
        Session session = null;
        try {
            session = SessionUtil.getInstance().getSession();
            session.delete(entity);
            session.flush();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    public BaseEntity save(BaseEntity entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = SessionUtil.getInstance().getSession();
            transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
            System.out.println("Session kapatıldı.");
        }
        return entity;
    }


    public BaseEntity update(BaseEntity entity) {
        Session session = null;
        try {
            session = SessionUtil.getInstance().getSession();
            session.saveOrUpdate(entity);
            session.flush();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return entity;
    }

}
