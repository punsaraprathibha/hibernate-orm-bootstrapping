//package lk.ijse.gdse.hibernate;
//
//import lk.ijse.gdse.hibernate.embedded.NameIdentifier;
//import lk.ijse.gdse.hibernate.entity.Customer;
//import lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
///**
// * Throughout this class we're going to understand about
// * the Detached State & how to change an object's state to Detached state
// * and how to again change to Persistent State after doing a couple of modifications...
// */
//public class DetachedState {
//
//    /**
//     * @param args : java.lang.String[]
//     * Main method of this Application
//     */
//    public static void main(String[] args) {
//
//        Session session = SessionFactoryConfiguration
//                .getInstance().getSession();
//
//        Transaction transaction = session.beginTransaction();
//
//        Customer customer = new Customer(); // Transient State
//        customer.setId(3L);
//        customer.setAddress("Galle");
//        customer.setAge(30);
//        customer.setSalary(30000.00);
//
//        long id = (long) session.save(customer);// Persistent State
//        System.out.println(customer);
//
//        transaction.commit();
//        session.close(); // We close the session here now
//
//        NameIdentifier name = new NameIdentifier();
//        name.setFirstName("Kamal");
//        name.setMiddleName("Perera");
//        name.setLastName("Surname");
//        customer.setName(name); // Since we've closed the session earlier at line 30,
//        // this customer object is now in Detach State
//
//        System.out.println(customer); // Detached State
//
//        // So, now we're going to reattach the Detached object to a new Session
//        Session session2 = SessionFactoryConfiguration
//                .getInstance().getSession();
//        Transaction transaction2 = session2.beginTransaction();
//
//        session2.merge(customer); // Again we acquire the Persistent State for customer object
//
//        transaction2.commit();
//
//        session2.close();
//    }
//}
