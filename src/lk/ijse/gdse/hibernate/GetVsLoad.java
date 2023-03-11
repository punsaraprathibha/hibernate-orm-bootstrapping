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
//public class GetVsLoad {
//
//    public static void main(String[] args) {
//
////        Session session = SessionFactoryConfiguration
////                .getInstance().getSession();
////        Transaction transaction = session.beginTransaction();
////
////        Customer customer = getCustomerEntity();
////        session.save(customer);
////        transaction.commit();
////        session.close();
//
////        System.out.println("-------------get()--------------");
////        Session session = SessionFactoryConfiguration
////                .getInstance().getSession();
////
////        Customer customer = session.get(Customer.class, 2L);
////        System.out.println("Customer Id : " + customer.getId());
//////        System.out.println("Customer First Name : " + customer.getName().getFirstName());
//////        System.out.println("Customer Middle Name : " + customer.getName().getMiddleName());
//////        System.out.println("Customer Last Name : " + customer.getName().getLastName());
//////        System.out.println("Customer Age : " + customer.getAge());
//////        System.out.println("Customer Address : " + customer.getAddress());
////        session.close();
//
//
//        System.out.println("\n\n------------load()-----------------");
//        Session session1 = SessionFactoryConfiguration.getInstance().getSession();
//
//        Customer loadCustomer = session1.load(Customer.class, 2L);
//        System.out.println("Customer Id : " + loadCustomer.getId());
//        System.out.println(loadCustomer);
////        System.out.println("Customer First Name : " + loadCustomer.getName().getFirstName());
////        System.out.println("Customer Middle Name : " + loadCustomer.getName().getMiddleName());
////        System.out.println("Customer Last Name : " + loadCustomer.getName().getLastName());
////        System.out.println("Customer Age : " + loadCustomer.getAge());
////        System.out.println("Customer Address : " + loadCustomer.getAddress());
//        session1.close();
//    }
//
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
