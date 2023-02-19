package lk.ijse.gdse.hibernate.util;

import lk.ijse.gdse.hibernate.entity.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Purpose of creating this class to do the necessary Session Factory Configurations
 * by creating;
 *  1. Service Registry
 *  2. Metadata Object
 *  3. Session Factory
 *  4. Session Object
 */
public class SessionFactoryConfiguration {

    private static SessionFactoryConfiguration factoryConfiguration;

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
        // Creating the Service Registry
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        // Creating the Metadata Object
        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Customer.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(
                        ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        // Creating the Session Factory
        SessionFactory sessionFactory = metadata
                .getSessionFactoryBuilder()
                .build();

        // Opens a new Session through the Session Factory & returns the Session created
        return sessionFactory.openSession();
    }
}
