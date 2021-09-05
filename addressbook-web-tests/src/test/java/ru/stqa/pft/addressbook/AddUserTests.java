package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class AddUserTests extends TestBase {


    @Test
    public void testAddUserTests() throws Exception {

        initAddUser();
        fillUserForm(new AddUserData("First name", "Middle name", "Last name", "Nick name", "Title", "Company name", "Address 1", "homePhone", "mobilePhone", "workPhone", "faxPhone", "email1", "email2", "email3", "homepage", "10", "January", "1900", "11", "February", "1901", "Address 2", "home 2", "notes"));
        clickEnter();
        goToHomePageInAddUserPage();
        selectAllUsers();
        deleteAllUsers();
        acceptAlert();
        logout();

    }

}