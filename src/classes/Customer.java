package classes;

/**
 * Created by JPMPC-B208 on 11/10/2016.
 */
public class Customer extends Person {
    public int customerID;
    public String memberLevel;
    public int creditCard;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }
}
