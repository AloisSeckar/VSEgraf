package db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * DBHandler - provides bunch of static methods to handle the Hibernate
 * routines for working with SQL database.
 * 
 * @author Alois Seckar [ ellrohir@seznam.cz ]
 * @version 0.1
 * @since 2015-02-13 14:50 GMT
 */
public class DBHandler {

    // ************************** \\
    // *        CONSTANTS       * \\
    // ************************** \\

    // ************************** \\
    // *       PROPERTIES       * \\
    // ************************** \\

    // ************************** \\
    // *      CONSTRUCTORS      * \\
    // ************************** \\

    // ************************** \\
    // *     ACCESS METHODS     * \\
    // ************************** \\

    // ************************** \\
    // *     PUBLIC METHODS     * \\
    // ************************** \\
    
    public static Object getSingleObject(String query) {
        Object result = new Object();
        try {
            Session session = createSession();
            try {
                session.getTransaction().begin();
                result = session.createQuery(query).uniqueResult();
                session.getTransaction().commit();
            } catch (RuntimeException e) {
                session.getTransaction().rollback();
                // TODO log error
            }
            closeSession(session);
        } catch (HibernateException e) {
            // TODO log error
        }
        //
        return result;
    }
    
    public static Iterator getListOfObjects(String query) {
        List result = new ArrayList();
        try {
            Session session = createSession();
            try {
                session.getTransaction().begin();
                result = session.createQuery(query).list();
                session.getTransaction().commit();
            } catch (RuntimeException e) {
                session.getTransaction().rollback();
                // TODO log error
            }
            closeSession(session);
        } catch (HibernateException e) {
            // TODO log error
        }
        //
        return result.iterator();
    }
    
    public static String saveObject(Object object) {
        try {
            Session session = createSession();
            try {
                session.getTransaction().begin();
                session.save(object);
                session.getTransaction().commit();
            } catch (RuntimeException e) {
                session.getTransaction().rollback();
                // TODO log error
            }
            //
            return "S_SUCCESS";
        } catch (HibernateException e) {
            // TODO log error
            return "S_ERROR " + e.getMessage();
        }
    }
    
    public static String updateObject(Object object) {
        try {
            Session session = createSession();
            try {
                session.getTransaction().begin();
                session.update(object);
                session.getTransaction().commit();
            } catch (RuntimeException e) {
                session.getTransaction().rollback();
                // TODO log error
            }
            //
            return "S_SUCCESS";
        } catch (HibernateException e) {
            // TODO log error
            return "S_ERROR " + e.getMessage();
        }
    }
    
    public static String deleteObject(Object object) {
        try {
            Session session = createSession();
            try {
                session.getTransaction().begin();
                session.delete(object);
                session.getTransaction().commit();
            } catch (RuntimeException e) {
                session.getTransaction().rollback();
                // TODO log error
            }
            //
            return "S_SUCCESS";
        } catch (HibernateException e) {
            // TODO log error
            return "S_ERROR " + e.getMessage();
        }
    }
    
    public static long countRows(String query) {
        long count = 0;
        try {
            Session session = createSession();
            session.getTransaction().begin();
            count = (Long)session.createQuery("SELECT count(*) " + query).uniqueResult();
        } catch (HibernateException e) {
            // TODO log error
        }
        return count;
    }

    // ************************** \\
    // *    PRIVATE METHODS     * \\
    // ************************** \\
    
    private static Session createSession() {
        // create session
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = 
                new StandardServiceRegistryBuilder().
                        applySettings(configuration.getProperties());
        SessionFactory factory = 
                configuration.buildSessionFactory(builder.build());
        Session session = factory.openSession();
        // return prepared session
        return session;
    }
    
    private static void closeSession(Session session) {
        session.getTransaction().commit(); 
        // dismiss session    
        session.flush();
        session.close();
    }

}