package lk.ijse.gdse.hibernate;

import lk.ijse.gdse.hibernate.entity.Customer;
import lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * Throughout this class we're going to understand about
 * the Removed State & how to remove a Persistent object from db...
 */
public class RemovedState {

    /**
     * @param args : java.lang.String[]
     * Main method of this Application
     */
    public static void main(String[] args) {

        Session session = SessionFactoryConfiguration
                .getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class, 1L); // Persistent State

        session.delete(customer); // Removed State

        transaction.commit();
        session.close();
    }
}
