package lk.ijse.gdse.hibernate.embedded;

import javax.persistence.Embeddable;

/**
 * Embeddable java class which defines the Mobile Numbers with its type
 */
@Embeddable
public class MobileNo {
    private String type;
    private String mobileNo;

    /**
     * Default Constructor
     */
    public MobileNo() {}

    /**
     * @param type : java.lang.String
     * @param mobileNo : java.lang.String
     * All args constructor
     */
    public MobileNo(String type, String mobileNo) {
        this.type = type;
        this.mobileNo = mobileNo;
    }

    /**
     * @return java.lang.String
     */
    public String getType() {
        return type;
    }

    /**
     * @param type : java.lang.String
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return java.lang.String
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * @param mobileNo : java.lang.String
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
