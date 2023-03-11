//package lk.ijse.gdse.hibernate.entity;
//
//import lk.ijse.gdse.hibernate.embedded.NameIdentifier;
//import lk.ijse.gdse.hibernate.embedded.MobileNo;
//import org.hibernate.annotations.CreationTimestamp;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Here is our Entity Model Java Class.
// * Still we didn't define and introduced it to Hibernate as an Entity class.
// * We're gonna to do it in next session
// */
////1. 1st way to define table name => @Entity(name = "customer")
////2. 2nd way to define table name =>
////   @Entity
////   @Table(name = "customer")
//@Entity
//@Table(name = "customer")
//public class Customer {
//    @Id // Tells hibernate that this is the primary key of this entity
//    @Column(name = "customer_id") // defines how the column name should be generated in database
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // Defines what is the ID GenerationType hibernate should use
//    private long id;
//    private NameIdentifier name; // Defines a custom-made Embeddable class to contain name related composite attributes
//    @Column(name = "customer_address")
//    private String address;
//    @Column(name = "customer_salary")
//    private double salary;
//    @Column(name = "customer_age", columnDefinition = "SMALLINT") // Defines how the data format type should maintain in the database for this attribute
//    private int age;
//    @ElementCollection
//    @CollectionTable(
//            name = "customer_mobile_nos",
//            joinColumns = @JoinColumn(name = "customer_id"))
//    private List<MobileNo> phoneNos = new ArrayList<>();
//
//    @Transient // Indicates that a field is not to be persisted or ignore fields to save in the database
//    private String dob;
//
//    @CreationTimestamp // make it easy to track the timestamp when the object persistence (creation) in DB
//    private Timestamp createdDate;
//
//    /**
//     * Default Constructor
//     */
//    public Customer() {}
//
//    /**
//     * @param id : long
//     * @param name : java.lang.String
//     * @param address : java.lang.String
//     * @param salary : double
//     * All Args Constructor
//     */
//    public Customer(long id, NameIdentifier name, String address, double salary) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//        this.salary = salary;
//    }
//
//    /**
//     * @return long
//     */
//    public long getId() {
//        return id;
//    }
//
//    /**
//     * @param id : long
//     */
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    /**
//     * @return java.lang.String
//     */
//    public NameIdentifier getName() {
//        return name;
//    }
//
//    /**
//     * @param name : java.lang.String
//     */
//    public void setName(NameIdentifier name) {
//        this.name = name;
//    }
//
//    /**
//     * @return java.lang.String
//     */
//    public String getAddress() {
//        return address;
//    }
//
//    /**
//     * @param address : java.lang.String
//     */
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    /**
//     * @return double
//     */
//    public double getSalary() {
//        return salary;
//    }
//
//    /**
//     * @param salary : double
//     */
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    /**
//     * @return int
//     */
//    public int getAge() {
//        return age;
//    }
//
//    /**
//     * @param age : int
//     */
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    /**
//     * @return java.util.List<lk.ijse.gdse.hibernate.embedded.MobileNo>
//     */
//    public List<MobileNo> getPhoneNos() {
//        return phoneNos;
//    }
//
//    /**
//     * @param phoneNos java.util.List<lk.ijse.gdse.hibernate.embedded.MobileNo>
//     */
//    public void setPhoneNos(List<MobileNo> phoneNos) {
//        this.phoneNos = phoneNos;
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", name=" + name +
//                ", address='" + address + '\'' +
//                ", salary=" + salary +
//                ", age=" + age +
//                ", phoneNos=" + phoneNos +
//                ", dob='" + dob + '\'' +
//                ", createdDate=" + createdDate +
//                '}';
//    }
//}
