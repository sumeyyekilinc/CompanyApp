package company.util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
    private static SessionUtil me;
   private static  SessionFactory sessionFactory;
  private Configuration configuration;

    public SessionUtil() throws HibernateException {
        configuration = new Configuration().configure();
        sessionFactory= configuration.buildSessionFactory();
    }



    public static synchronized SessionUtil getInstance() throws HibernateException {
        if (me == null) {
            me = new SessionUtil();
        }

        return me;
    }

    public Session getSession() throws HibernateException {
        Session session = sessionFactory.openSession();
        if (!session.isConnected()) {
            this.reconnect();
        }
        return session;
    }

    private void reconnect() throws HibernateException {
        this.sessionFactory = configuration.buildSessionFactory();
    }

}



