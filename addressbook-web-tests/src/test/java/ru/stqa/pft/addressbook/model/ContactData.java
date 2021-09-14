package ru.stqa.pft.addressbook.model;

public class ContactData {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String firstAddress;
    private final String mobilePhoneNumber;
    private final String emailAddress1;
    private String group;

    public ContactData(String firstName, String middleName, String lastName, String firstAddress, String mobilePhoneNumber,
                       String emailAddress1,
                       String group) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.firstAddress = firstAddress;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.emailAddress1 = emailAddress1;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getFirstAddress() {
        return firstAddress;
    }


    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }


    public String getEmailAddress1() {
        return emailAddress1;
    }


    public String getGroup() {
        return group;
    }
}
