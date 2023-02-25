package lk.ijse.gdse.hibernate.embedded;

import javax.persistence.Embeddable;

/**
 * Embeddable java class which defines the Composite Name Attributes
 */
@Embeddable
public class NameIdentifier {
    private String firstName;
    private String middleName;
    private String lastName;

    /**
     * Default Constructor
     */
    public NameIdentifier() {}

    /**
     * @param firstName : java.lang.String
     * @param middleName : java.lang.String
     * @param lastName : java.lang.String
     */
    public NameIdentifier(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * @return java.lang.String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName : java.lang.String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return java.lang.String
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName : java.lang.String
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return java.lang.String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName : java.lang.String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
