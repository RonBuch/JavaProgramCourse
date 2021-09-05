package ru.stqa.pft.addressbook.model;

public class AddUserData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String title;
    private final String companyName;
    private final String firstAddress;
    private final String homePhoneNumber;
    private final String mobilePhoneNumber;
    private final String workPhoneNumber;
    private final String faxPhoneNumber;
    private final String emailAddress1;
    private final String emailAddress2;
    private final String emailAddress3;
    private final String homepage;
    private final String birthDay;
    private final String birthMonth;
    private final String birthYear;
    private final String anniversaryDay;
    private final String anniversaryMonth;
    private final String anniversaryYear;
    private final String secondAddress;
    private final String secondPhoneNumber;
    private final String notes;

    public AddUserData(String firstName, String middleName, String lastName, String nickName, String title, String companyName, String firstAddress, String homePhoneNumber, String mobilePhoneNumber, String workPhoneNumber, String faxPhoneNumber, String emailAddress1, String emailAddress2, String emailAddress3, String homepage, String birthDay, String birthMonth, String birthYear, String anniversaryDay, String anniversaryMonth, String anniversaryYear, String secondAddress, String secondPhoneNumber, String notes) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.title = title;
        this.companyName = companyName;
        this.firstAddress = firstAddress;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.workPhoneNumber = workPhoneNumber;
        this.faxPhoneNumber = faxPhoneNumber;
        this.emailAddress1 = emailAddress1;
        this.emailAddress2 = emailAddress2;
        this.emailAddress3 = emailAddress3;
        this.homepage = homepage;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.anniversaryDay = anniversaryDay;
        this.anniversaryMonth = anniversaryMonth;
        this.anniversaryYear = anniversaryYear;
        this.secondAddress = secondAddress;
        this.secondPhoneNumber = secondPhoneNumber;
        this.notes = notes;
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

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getFirstAddress() {
        return firstAddress;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public String getFaxPhoneNumber() {
        return faxPhoneNumber;
    }

    public String getEmailAddress1() {
        return emailAddress1;
    }

    public String getEmailAddress2() {
        return emailAddress2;
    }

    public String getEmailAddress3() {
        return emailAddress3;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getAnniversaryDay() {
        return anniversaryDay;
    }

    public String getAnniversaryMonth() {
        return anniversaryMonth;
    }

    public String getAnniversaryYear() {
        return anniversaryYear;
    }

    public String getSecondAddress() {
        return secondAddress;
    }

    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }

    public String getNotes() {
        return notes;
    }
}
