package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.AddUserData;

public class AddUserTests extends TestBase {


    @Test
    public void testAddUserTests() throws Exception {

        app.getAddUserHelper().initAddUser();
        app.getAddUserHelper().fillUserForm(new AddUserData("First name", "Middle name", "Last name", "Nick name", "Title", "Company name", "Address 1", "homePhone", "mobilePhone", "workPhone", "faxPhone", "email1", "email2", "email3", "homepage", "10", "January", "1900", "11", "February", "1901", "Address 2", "home 2", "notes"));
        app.getAddUserHelper().clickEnter();
        app.getAddUserHelper().goToHomePageInAddUserPage();
        app.logout();

    }

}