package lk.ijse.gdse.hibernate;

import lk.ijse.gdse.hibernate.embedded.NameIdentifier;
import lk.ijse.gdse.hibernate.embedded.MobileNo;
import lk.ijse.gdse.hibernate.entity.Customer;
import lk.ijse.gdse.hibernate.repository.CustomerRepository;
import lk.ijse.gdse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Main class of this Hibernate Application
 * So, let's call it as "AppInitializer"
 */
public class AppInitializer {
    /**
     * @param args : java.lang.String[]
     * Main method of this Application
     */
    public static void main(String[] args) throws InterruptedException {

        // (1) This is what we've firstly done & tested before creating the CustomerRepository
        Customer customer1 = getCustomerEntity();

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer1);
        transaction.commit();
        session.close();

        // ---------------------------------------------------------------------
        // (2) This is what we've done after creating the CustomerRepository
        // Please run the below operations one by one separately (Not all at once which
        // may give errors which hibernate can't manage with multiple sessions)

        CustomerRepository customerRepository = new CustomerRepository();
        Customer customer = getCustomerEntity();

        // 1. Performs Save/Insert through Customer Repository
        customerRepository.saveCustomer(customer);

        Thread.sleep(500); // Wait some time before retrieve data after save

        // 2. Get Existing Customer data from the database table
        customerRepository = new CustomerRepository();
        Customer existingCustomer = customerRepository.getCustomer(1L);
        System.out.println("Customer Id: " + existingCustomer.getId());

        // 3. Sets the modified data to the attributes through the setters
        existingCustomer.setAddress("Matara");
        existingCustomer.setAge(35);

        // 4. Updates the existing customer from DB
        customerRepository = new CustomerRepository();
        boolean isUpdated = customerRepository.updateCustomer(existingCustomer);
        if (isUpdated) {
            System.out.println("Customer " + existingCustomer.getId() +
                    " Updated Successfully!");
        } else {
            System.out.println("Customer " + existingCustomer.getId() +
                    " Not Updated!");
        }

        // 5. Deletes the existing Customer from DB
        customerRepository = new CustomerRepository();
        boolean isDeleted = customerRepository.deleteCustomer(existingCustomer);
        if (isDeleted) {
            System.out.println("Customer " + existingCustomer.getId() +
                    " Deleted Successfully!");
        } else {
            System.out.println("Customer " + existingCustomer.getId() +
                    " Deletion Failed!");
        }
    }

    private static Customer getCustomerEntity() {
        Customer customer = new Customer();
        // Sets Customer table's primary key
        customer.setId(1L);

        // Defines the NameIdentifier - Embeddable object data
        NameIdentifier nameIdentifier = new NameIdentifier();
        nameIdentifier.setFirstName("Saman");
        nameIdentifier.setMiddleName("Perera");
        nameIdentifier.setLastName("SurName");

        // Sets the NameIdentifier object data as Name in Customer Entity
        customer.setName(nameIdentifier);

        // Sets the customer address
        customer.setAddress("Galle");
        // Sets the customer salary
        customer.setSalary(30000.00);
        // Sets the customer age
        customer.setAge(22);

        // Defines a List of MobileNo - Embeddable object data
        List<MobileNo> phoneNos = new ArrayList<>();
        phoneNos.add(new MobileNo("MOBILE", "07763483457"));
        phoneNos.add(new MobileNo("HOME", "0918475834758"));
        // Sets the defined List of MobileNo - Embeddable objects
        // as PhoneNos in Customer Entity
        customer.setPhoneNos(phoneNos);

        return customer;
    }
}
