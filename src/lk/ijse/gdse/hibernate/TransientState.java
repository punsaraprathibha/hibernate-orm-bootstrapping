package lk.ijse.gdse.hibernate;

import lk.ijse.gdse.hibernate.entity.Customer;
import lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Throughout this class we're going to understand about
 * the Transient State & how to persist a Transient object in db...
 */
public class TransientState {

    /**
     * @param args : java.lang.String[]
     * Main method of this Application
     */
    public static void main(String[] args) {

        Session session = SessionFactoryConfiguration
                .getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        // When a new object is created, according to hibernate
        // it's implicitly (Initial State, Default State) in Transient State
        Customer customer = new Customer(); // Transient State
        customer.setAddress("Transient");
        customer.setAge(20);

        session.save(customer); // Persistent State

        transaction.commit();

        customer.setSalary(30000.00);

        session.close();
    }
}
