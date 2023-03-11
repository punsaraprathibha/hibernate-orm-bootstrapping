package lk.ijse.gdse.hibernate.util;

import lk.ijse.gdse.hibernate.entity.Customer;
import lk.ijse.gdse.hibernate.entity.Item;
import lk.ijse.gdse.hibernate.entity.Order;
import lk.ijse.gdse.hibernate.entity.OrderDetail;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Purpose of creating this class to do the necessary Session Factory Configurations
 * by creating;
 * 1. Service Registry
 * 2. Metadata Object
 * 3. Session Factory
 * 4. Session Object
 */
public class SessionFactoryConfiguration {

    private static SessionFactoryConfiguration factoryConfiguration;
    private final SessionFactory sessionFactory;

    /**
     * Private Default Constructor
     * Restricts creating new instances again and again
     * from this class from outside this class
     */
    private SessionFactoryConfiguration() {
        sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(OrderDetail.class)
                .buildSessionFactory();
    }

    /**
     * @return lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration
     * Purpose of this method is to get an Instance of this same class
     * by limiting the object recreation (Limiting again and again Object creation)
     */
    public static SessionFactoryConfiguration getInstance() {
        return (null == factoryConfiguration)
                ? factoryConfiguration = new SessionFactoryConfiguration()
                : factoryConfiguration;
    }

    /**
     * @return org.hibernate.Session
     * @throws org.hibernate.HibernateException
     * Purpose of this method is to get a Session from the Session Factory
     */
    public Session getSession() throws HibernateException {
        // Opens a new Session through the Session Factory & returns the Session created
        return sessionFactory.openSession();
    }
}
