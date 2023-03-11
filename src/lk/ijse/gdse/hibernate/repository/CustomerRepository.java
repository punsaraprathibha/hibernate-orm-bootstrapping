package lk.ijse.gdse.hibernate.repository;

import lk.ijse.gdse.hibernate.entity.Customer;
import lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Defines a Customer Repository to Manage All
 * the CRUD Operations in a single place
 */
public class CustomerRepository {
    private final Session session;

    /**
     * No Args Constructor
     * Initializes Session Object which is later going to
     * be used for below CRUD operations
     */
    public CustomerRepository() {
        session = SessionFactoryConfiguration.getInstance()
                .getSession();
    }

    /**
     * @param customer : lk.ijse.gdse.hibernate.entity.Customer
     * @return java.lang.Long
     * Performs a customer object save (persistence) operation
     */
    public Long saveCustomer(Customer customer) {
        Transaction transaction = session.beginTransaction();
        try {
            Long id = (Long) session.save(customer); // <= Hibernate
            // session.persist(customer); <= JPA
            transaction.commit();
            session.close();
            return id;
        } catch (Exception ex) {
            transaction.rollback();
            session.close();
            ex.printStackTrace();
            return -1L;
        }
    }

    /**
     * @param customer : lk.ijse.gdse.hibernate.entity.Customer
     * @return boolean
     * Performs a given customer object update operation
     */
    public boolean updateCustomer(Customer customer) {
        Transaction transaction = session.beginTransaction();
        try {
            session.update(customer);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception ex) {
            transaction.rollback();
            session.close();
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * @param id : long
     * @return lk.ijse.gdse.hibernate.entity.Customer
     * Retrieves customer object data based on the given customer id
     */
    public Customer getCustomer(long id) {
        try {
            Customer customer = session.get(Customer.class, id);
            session.close(); // We've closed the unclosed sessions in previous week's code
            return customer;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    /**
     * @param customer : lk.ijse.gdse.hibernate.entity.Customer
     * @return boolean
     * Deletes a specific customer by customer object which is passed
     */
    public boolean deleteCustomer(Customer customer) {
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(customer);
            transaction.commit();
            session.close(); // We've closed the unclosed sessions in previous week's code
            return true;
        } catch (Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
            session.close(); // We've closed the unclosed sessions in previous week's code
            return false;
        }
    }

    // HQL - Hibernate Query Language
    public List<Customer> getAllCustomers() {
        String sqlQuery = "FROM Customer";
        Query query = session.createQuery(sqlQuery);
        List list = query.list();
        session.close();
        return list;
    }

    // JPQL
    public List<Customer> getAllJPQLCustomers() {
        String sql = "SELECT C FROM Customer AS C"; // alias
        Query query = session.createQuery(sql);
        List list = query.list();
        session.close();
        return list;
    }
}
