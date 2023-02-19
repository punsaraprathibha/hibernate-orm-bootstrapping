package lk.ijse.gdse.hibernate.entity;

/**
 * Here is our Entity Model Java Class.
 * Still we didn't define and introduced it to Hibernate as an Entity class.
 * We're gonna to do it in next session
 */
public class Customer {
    private long id;
    private String name;
    private String address;
    private double salary;

    /**
     * Default Constructor
     */
    public Customer() {}

    /**
     * @param id : long
     * @param name : java.lang.String
     * @param address : java.lang.String
     * @param salary : double
     * All Args Constructor
     */
    public Customer(long id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    /**
     * @return long
     */
    public long getId() {
        return id;
    }

    /**
     * @param id : long
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return java.lang.String
     */
    public String getName() {
        return name;
    }

    /**
     * @param name : java.lang.String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return java.lang.String
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address : java.lang.String
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return double
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary : double
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
