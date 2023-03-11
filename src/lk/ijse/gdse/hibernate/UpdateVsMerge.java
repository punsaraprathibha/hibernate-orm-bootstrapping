//package lk.ijse.gdse.hibernate;
//
//import lk.ijse.gdse.hibernate.embedded.MobileNo;
//import lk.ijse.gdse.hibernate.embedded.NameIdentifier;
//import lk.ijse.gdse.hibernate.entity.Customer;
//import lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class UpdateVsMerge {
//
//    public static void main(String[] args) {
////        Session session = SessionFactoryConfiguration
////                .getInstance().getSession();
////        Transaction transaction = session.beginTransaction();
////
////        Customer customer = getCustomerEntity();
////        session.save(customer);
////        transaction.commit();
////        session.close();
//
//        System.out.println("-----update()-------");
//
//        Session session = SessionFactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//
//        Customer customer = session.get(Customer.class, 3L);
////        Customer customer = new Customer();
//        customer.setAddress("Jaffna");
//
//        session.merge(customer); // session.update(customer)
//        transaction.commit();
//        session.close();
//
//    }
//
//    private static Customer getCustomerEntity() {
//        Customer customer = new Customer();
//        // Sets Customer table's primary key
//        customer.setId(1L);
//
//        // Defines the NameIdentifier - Embeddable object data
//        NameIdentifier nameIdentifier = new NameIdentifier();
//        nameIdentifier.setFirstName("Saman");
//        nameIdentifier.setMiddleName("Perera");
//        nameIdentifier.setLastName("SurName");
//
//        // Sets the NameIdentifier object data as Name in Customer Entity
//        customer.setName(nameIdentifier);
//
//        // Sets the customer address
//        customer.setAddress("Galle");
//        // Sets the customer salary
//        customer.setSalary(30000.00);
//        // Sets the customer age
//        customer.setAge(22);
//
//        // Defines a List of MobileNo - Embeddable object data
//        List<MobileNo> phoneNos = new ArrayList<>();
//        phoneNos.add(new MobileNo("MOBILE", "07763483457"));
//        phoneNos.add(new MobileNo("HOME", "0918475834758"));
//        // Sets the defined List of MobileNo - Embeddable objects
//        // as PhoneNos in Customer Entity
//        customer.setPhoneNos(phoneNos);
//
//        return customer;
//    }
//}
