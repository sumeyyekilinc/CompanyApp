package company.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
    static SessionFactory sessionFactory=null;
    public static void main(String[] args) {


        try{
            SessionFactory sessionFactory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml");
            Session session = sessionFactory.openSession();
            session.beginTransaction();
        }catch(Exception e) {
            System.err.println("Exception while initializing hibernate util.. ");
            e.printStackTrace();
        }

    }
    public static Session getSession() throws HibernateException {

        Session retSession=null;
        try {


            retSession=sessionFactory.openSession();
        }catch(Throwable t){
            System.err.println("Exception while getting session.. ");
            t.printStackTrace();
        }
        if(retSession == null) {
            System.err.println("session is discovered null");
        }

        return retSession;
    }


}
