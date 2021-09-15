package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDelitionTests extends TestBase {

    @Test
    public void delitionFirstOneUser() {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectFirstUserInList();
        app.getContactHelper().clickOnDeleteButton();
        app.getContactHelper().acceptAlert();
        app.logout();

    }


//    @Test()
//    public void delitionAllUsers() {
//        app.getNavigationHelper().goToHomePage();
//        app.getAddUserHelper().selectAllUsers();
//        app.getAddUserHelper().clickOnDeleteButton();
//        app.getAddUserHelper().acceptAlert();
//        app.logout();
//    }
}
